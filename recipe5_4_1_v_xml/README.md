# 스프링 레시피5 2장

##### 메인


1. @REST API 사용방법
response 될 list 를 rest api 호출이 있을때, 
Jaxb2Marshaller 을 이용하여 xml로 변환하여 응답한다.
-> Jaxb2Marshaller는 너무 불편하니 @Responsebody를 사용하여 위 과정을 생략한다.
-> @ResponseBody 사용하는대신 @Controller 를 @RestController 로 사용할수있다.
-> url/member/{memberid} 와 같이 url 패턴을 구성함으로써, 원하는 사용자의 정보만 응답할수있다.
->적절하지않은 요청이올때 에러코드 반환
##### 서브
