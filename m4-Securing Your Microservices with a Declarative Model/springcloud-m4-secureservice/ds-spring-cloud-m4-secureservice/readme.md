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


curl -X POST \
  http://localhost:9000/services/oauth/token \
  -H 'authorization: Basic amF2YUhlbHBlcjpqYXZhSGVscGVyc2VjcmV0' \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/x-www-form-urlencoded' \
  -H 'postman-token: 608b398c-efea-b26e-803a-acdf30016992' \
  -d 'grant_type=password&client_id=javaHelper&username=alpha&password=pass1'
  
```
{
    "access_token": "49242b5e-da0d-4fab-9529-5c26d7a1d9ce",
    "token_type": "bearer",
    "refresh_token": "b1afe44f-5d88-4818-a917-cabd052e4ea8",
    "expires_in": 43199,
    "scope": "toll_read toll_report"
}
```

curl -X GET \
  http://localhost:9001/services/tolldata \
  -H 'authorization: Bearer 49242b5e-da0d-4fab-9529-5c26d7a1d9ce' \
  -H 'cache-control: no-cache' \
  -H 'postman-token: 01e293cf-3910-29ea-cfa4-2068d4eda33b'
  
  
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