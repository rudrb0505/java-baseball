## 📋 구현 기능 목록

### ✅ 게임 시작
+ [x] 상대방(컴퓨터)이 숫자를 중복되지 않도록 생성

### ✅ 사용자의 숫자 입력
+ [x] 사용자가 3자리의 수 입력
+ [x] 잘못된 값을 입력시 애플리케이션 종료(IllegalArgumentException)
  + [x] **[예외]** 사용자가 숫자가 아닌 값(null, 문자 등)을 입력한 경우 예외처리
  + [x] **[예외]** 사용자가 입력한 수가 3자리가 아닐 경우 예외처리
  + [x] **[예외]** 사용자가 서로다른 숫자를 입력하지 않은 경우 예외처리
  + [x] **[예외]** 사용자가 0을 입력한 경우 예외처리


### ✅ 사용자가 입력한 숫자 비교
+ [x] 사용자가 입력한 숫자와 상대방(컴퓨터)이 생성한 숫자 비교
+ [x] 비교 결과에 따라 힌트 출력(볼, 스트라이크, 낫싱)
+ [x] 모든 숫자가 일치할 때까지 사용자에게 반복해서 숫자 입력 받기

### ✅ 게임 종료
+ [x] 상대방의 숫자와 사용자가 입력한 숫자가 일치하는 경우 게임 종료
+ [x] 사용자가 재시작과 종료 중 하나를 선택하여 해당하는 숫자 입력
+ [x] 숫자 1 입력시 프로그램 재시작 / 숫자 2 입력시 프로그램 종료
+ [x] 잘못된 값을 입력시 애플리케이션 종료(IllegalArgumentException)
  + [x] **[예외]** 사용자가 숫자가 아닌 값(null, 문자 등)을 입력한 경우 예외처리
  + [x] **[예외]** 사용자가 입력한 숫자가 1, 2가 아닐 경우 예외처리
