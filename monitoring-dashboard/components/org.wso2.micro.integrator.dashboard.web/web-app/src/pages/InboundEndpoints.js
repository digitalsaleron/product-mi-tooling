/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 *
 */

import React from 'react';
import EnhancedTable from '../commons/EnhancedTable';
import { useSelector } from 'react-redux';
import HTTPClient from '../utils/HTTPClient';

export default function InboundEndpoints() {
    const [pageInfo] = React.useState({
        pageId: "inbound-endpoints",
        title: "Inbound Endpoints",
        headCells: [
            {id: 'name', label: 'Inbound Endpoint Name'},
            {id: 'nodes', label: 'Nodes'},
            {id: 'protocol', label: 'Protocol'}],
        tableOrderBy: 'name'
    });

    const [inboundEpList, setInboundEpList] = React.useState([]);

    const globalGroupId = useSelector(state => state.groupId);
    const selectedNodeList = useSelector(state => state.nodeList);

    const retrieveInboundEps = () => {
        HTTPClient.getArtifacts("inbound-endpoints", globalGroupId, selectedNodeList).then(response => {
            setInboundEpList(response.data)
        })
    }

    React.useEffect(() => {
        retrieveInboundEps();
    },[globalGroupId, selectedNodeList])

    const retrieveData = () => {
        retrieveInboundEps();
    }

    return <EnhancedTable pageInfo={pageInfo} dataSet={inboundEpList} retrieveData={retrieveData}/>
}
