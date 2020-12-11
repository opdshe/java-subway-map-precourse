# 👨🏻‍💻 지하철 노선도 미션
- 지하철 역과 노선을 관리하는 지하철 노선도 기능을 구현한다.

<br>

## 🍚 구현해야 할 기능 목록
[공통 기능]
- [ ] 제시된 정보대로 역, 노선 정보 초기화하기
- [x] 상황에 맞는 출력 기능 구현
    - 에러 메세지 출력 기능 ([ERROR]로 시작)
    - 안내 메세지 출력 기능 (## 로 시작)
    - 결과 메세지 출력 기능 ([INFO] 로 시작)

[지하철 역 관련 기능]
- 역 등록 기능
    - [x] 지하철 역 이름이 2글자 이상인지 검증
    - [x] 지하철 역 이름이 한글인지 검증
    - [x] 지하철 역 이름이 중복되지 않는지 검증
    - [x] 지하철 역 이름을 입력받는 기능
    - [x] 입력받은 역을 등록하는 기능
    
- 역 삭제 기능
    - [ ] 노선에 등록된 역을 삭제하지 않도록 검증
    - [x] 등록되지 않은 역 삭제시도하는 지 검증
    - [x] 지하철 역 이름을 입력받는 기능
    - [x] 입력받은 역을 삭제하는 기능
    
- 역 목록 조회 기능
    - [x] 역 목록 출력하는 기능
 
- [x] 역 관련 기능을 입력받는 기능
- [x] 역 관련 기능을 매핑하는 기능
    - [x] 존재하지 않는 기능인지 검증

[지하철 노선 관련 기능]
- 노선 등록 기능
    - [ ] 노선 이름이 2글자 이상인지 검증
    - [ ] 노선 이름이 숫자 혹은 한글로 이루어져 있는지 검증
    - [ ] 노선 이름이 중복되지 않는지 검증
    - [x] 노선 이름을 입력받는 기능
    - [x] 등록할 노선의 상행 종점역과 하행 종점역 입력받는 기능
    - [x] 지하철 노선을 등록하는 기능
        - 등록되지 않은 역은 노선의 종점으로 등록할 수 없다. 

- 노선 삭제 기능
    - [ ] 삭제할 노선이 현재 존재하는 노선인지 검증
    - [ ] 삭제할 노선 이름을 입력받는 기능
    - [ ] 노선이름을 통해 해당 노선을 삭제하는 기능
 
- 노선 목록 조회 기능
    - [ ] 노선 목록을 출력하는 기능

- [ ] 노선관련 기능들을 매핑하는 기능 구현
    
[지하철 구한 관련 목록]
- 구간 추가 기능
    - [ ] 추가하려는 구간의 노선이 현재 존재하는 노선인지 검증
    - [ ] 추가하려는 구간의 노선을 입력하는 기능
    - [ ] 추가하려는 구간의 역 이름이 해당 노선에 이미 존재하는 역은 아닌지 검증
    - [ ] 추가하려는 구간의 역이름을 입력받는 기능
    - [ ] 역의 순서가 올바른지 검증
        - ex) 현재 해당 노선에 3개의 역이 존재하는데, 4번을 입력한 경우
    - [ ] 순서를 입력 받는 기능
    - [ ] 구간을 등록하는 기능

- 구간 삭제 기능
    - [ ] 삭제하려는 구간의 노선이 현재 존재하는 노선인지 검증
    - [ ] 삭제하려는 구간의 노선을 입력받는 기능
    - [ ] 삭제하려는 구간의 역이 현재 존재하는 역인지 검증
    - [ ] 삭제하려는 구간의 역이름을 입력받는 기능
    
[지하철 노선도 출력 기능]
- [ ] 지하철 노선도 출력기능 구현

