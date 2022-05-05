# Sort  
여러개의 정렬 알고리즘을 입력개수(2^5 ~ 2^20)을 증가시킴에 따라 걸리는 시간을 비교하기 위해  
best case : 이미 정렬이 된 배열  
average case : 랜덤으로 값이 분포 되어있는 배열  
worst case : 반대로 정렬이 된 배열  
3가지 경우로 나눠서 비교  

50번 반복한 후 평균값을 이용해서 그래프를 그림  

편차가 심한 경우가 있어 최댓값 최솟값 제외  

그래프를 그린 후에 y축(시간)에 logscale을 했을 때 그래프의 변화  

그래프는 matlab을 이용해서 그렸다  


1. 선택정렬  
2. 삽입정렬  
3. 버블정렬  
4. 쉘정렬  
5. 퀵정렬  
6. 힙정렬  

## 입력 개수에 따른 시간 그래프  

### 1. 선택정렬
![image](https://user-images.githubusercontent.com/98294597/166940674-8ca5b803-31b9-496f-b5c8-e7d3f4feed59.png)


### 2. 삽입정렬
![image](https://user-images.githubusercontent.com/98294597/166940794-598195a5-d978-47fc-9e92-21c1c110a18a.png)


### 3. 버블정렬
![image](https://user-images.githubusercontent.com/98294597/166940877-2123d1de-a852-46f1-bfdc-6c0a2355042e.png)


### 4. 쉘정렬
![image](https://user-images.githubusercontent.com/98294597/166940957-9f918cc6-766c-450a-a9a3-8159c25703a9.png)


### 5. 퀵정렬
![image](https://user-images.githubusercontent.com/98294597/166941036-a38fee9f-d5a1-4aa5-9a37-427dc5554776.png)


### 6. 힙정렬
![image](https://user-images.githubusercontent.com/98294597/166941176-1c43cc63-abb8-4bea-b0d4-94b28cb6bbc5.png)
