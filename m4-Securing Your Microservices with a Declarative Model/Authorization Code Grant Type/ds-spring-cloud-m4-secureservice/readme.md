# 

curl -X GET \
  http://localhost:9001/services/tolldata \
  -H 'authorization: Basic dXNlcjo2YjBhZTcwNi0xZTcyLTQzNmMtYTFlNy1lNmFlNWU3YmFjMTU=' \
  -H 'cache-control: no-cache' \
  -H 'postman-token: a4936940-2c2d-deca-a3a4-bda60dab77f3' \
  -d 'Station100, SPRINGXD,2020-04-20 02:02:49'
  
```
[
    {
        "Id": "200",
        "stationId": "station150",
        "licensePlate": "B65GT1W",
        "timestamp": "2016-09-30T06:31:22"
    },
    {
        "Id": "201",
        "stationId": "station119",
        "licensePlate": "AHY673B",
        "timestamp": "2016-09-30T06:32:50"
    },
    {
        "Id": "202",
        "stationId": "station150",
        "licensePlate": "ZN2GP0",
        "timestamp": "2016-09-30T06:37:01"
    }
]
```