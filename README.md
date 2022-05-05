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
![image](https://user-images.githubusercontent.com/98294597/166945065-be17ad4a-376d-4b6e-961c-3011b9799e9b.png)

### 2. 삽입정렬
![image](https://user-images.githubusercontent.com/98294597/166945497-30d85860-436f-4bcc-b977-e2966ff5c220.png)


### 3. 버블정렬
![image](https://user-images.githubusercontent.com/98294597/166945944-dc1f8f7d-59fc-4b31-8c26-0e043eeee566.png)


### 4. 쉘정렬
![image](https://user-images.githubusercontent.com/98294597/166946382-a4333d6d-cc20-4bb2-8da2-ff40548171fb.png)


### 5. 퀵정렬
![image](https://user-images.githubusercontent.com/98294597/166946747-8b9ea655-effb-4b1a-8002-9d769d683eb4.png)


### 6. 힙정렬
![image](https://user-images.githubusercontent.com/98294597/166947129-ad3fb132-971c-46eb-9cf6-64ae2179b2da.png)
