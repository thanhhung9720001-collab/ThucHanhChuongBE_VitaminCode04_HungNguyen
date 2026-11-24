package org.example.vitamincode_pratice.service;

import org.example.vitamincode_pratice.entity.ListRequestEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ListRequestService {
    List<ListRequestEntity> getListRequests();
    List<ListRequestEntity> getListRequestsByNameAndConten(String userName, String content);
    ListRequestEntity insertRequest(ListRequestEntity request);
    ListRequestEntity updateListRequest(ListRequestEntity request);
    int deleteListRequest(int listRequestId);
}
