package org.example.vitamincode_pratice.api;

import lombok.RequiredArgsConstructor;
import org.example.vitamincode_pratice.entity.ListRequestEntity;
import org.example.vitamincode_pratice.mapper.ListRequestMapper;
import org.example.vitamincode_pratice.service.ListRequestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ListRequestApi {
    private final ListRequestService listRequestService;

    @GetMapping("/list-request")
    public ResponseEntity<List<ListRequestEntity>> getListRequests() {
        return ResponseEntity.ok(listRequestService.getListRequests());
    }

    @PostMapping("/list-request")
    public ResponseEntity<ListRequestEntity> insertListRequest(@RequestBody ListRequestEntity listRequestEntity) {
        ListRequestEntity savedListRequest = listRequestService.insertRequest(listRequestEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedListRequest);
    }

    @PutMapping("/list-request")
    public Map<Object, ListRequestEntity>  updateListRequest(@RequestBody ListRequestEntity listRequestEntity) {
        HashMap result = new HashMap();
        try {
            result.put("status", 200);
            result.put("message", "success");
            result.put("data", listRequestService.updateListRequest(listRequestEntity));
        } catch (Exception e) {
            result.put("status", 200);
            result.put("message", e.getMessage());
            result.put("data", null);
        }
        return result;
    }

    @DeleteMapping("/list-request/{requestId}")
    public Map<Object, ListRequestEntity> deleteListRequest(@PathVariable("requestId") int  requestId) {
        HashMap result = new HashMap();
        try {
            result.put("status", 200);
            result.put("message", "success");
            result.put("Data", listRequestService.deleteListRequest(requestId));
        } catch (Exception e) {
            result.put("status", 200);
            result.put("message", e.getMessage());
            result.put("Data", null);
        }
        return result;
    }
}
