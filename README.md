# cafe-service

> 고객이 어플을 통한 카페 메뉴를 주문하는 서비스입니다.
* * *
## 서비스 시나리오

> 기능적 요구사항

> 비기능적 요구사항

* * *
## Event Storming 결과

> 모델 완성
![image](https://user-images.githubusercontent.com/117132858/209902910-3f06a6c1-94d5-4289-b4ef-c18bf06d2ad8.png)

* * *
## 구현
  ### 1. Saga (Pub-Sub)
    장애간섭최소화

    Loosely coupled architecture
  ### 2. CQRS
    읽기 데이터 분리

    두개 이상의 다른 마이크로서비스의 데이터를 Projection(Join)하는 대시보드
  ### 3. Compensation / Correlation
    복구/취소

    해당 취소 건에 대한 필터링
  ### 4. Request-Response
    값을 참고(GET)

    order -> 주문이력을 조회
  ### 5. Circuit Breaker
    Istio 를 사용 경우 (Timeout)

    스프링클라우드 - Hystrix
  ### 6. GateWay / Ingress
    JWT 인증

  ### 7. Deploy / Pipeline
    Public 주소로 접속

    CI/CD 로 적용
  ### 8. Autoscale (HPA)

  ### 9. Zero-downtime deploy (Readiness probe)

  ### 10. Persistence Volume/ConfigMap/Secret
  1. EFS 생성
 
  ### 11. Self-healing (liveness probe)
  
  ### 12. Loggregation / Monitoring
  
  

