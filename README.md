# Springboot-with-Splunk

This is the project simulate my task in Finnae Mae : Createing a log4j log into Sprintboot and Using Splunk to monitor the issue



Correct API Message
http://127.0.0.1:8000/en-US/app/search/search?earliest=-60m%40m&latest=now&q=search%20index%3D%22order_api_dev%22&display.page.search.mode=smart&dispatch.sample_ratio=1&workload_pool=&sid=1683046965.574

API with addOrder
![image](https://user-images.githubusercontent.com/47329780/235733608-873c55b0-99f6-4795-86de-f1dcff6881f6.png)
![image](https://user-images.githubusercontent.com/47329780/235734227-ddbebd9e-a517-4c59-919f-7e221161d913.png)


API wiht getOrder
![image](https://user-images.githubusercontent.com/47329780/235733654-1ee4e7cb-e267-4091-b6cd-6be9c91f4915.png)
![image](https://user-images.githubusercontent.com/47329780/235734425-d281c04b-8b6b-4f40-924d-19d657f5e498.png)



Error API Message
http://127.0.0.1:8000/en-US/app/search/search?earliest=-60m%40m&latest=now&q=search%20index%3D%22order_api_dev%22%20error&display.page.search.mode=smart&dispatch.sample_ratio=1&workload_pool=&display.events.timelineEarliestTime=&display.events.timelineLatestTime=&sid=1683046844.572

id 102 not found 
![image](https://user-images.githubusercontent.com/47329780/235734486-6325b14a-262b-4632-9037-5a41c8425f8f.png)
![image](https://user-images.githubusercontent.com/47329780/235734733-732c255d-7a7e-4cb8-8e35-2c4d60963d8f.png)

