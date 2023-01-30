package com.ssafy.osws.lecture.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.osws.lecture.dto.response.ResponseLectureDetail;
import com.ssafy.osws.lecture.dto.response.ResponseWeeklyInfo;
import com.ssafy.osws.notice.dto.request.RequestModifyNotice;


import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/lecture")
public class LectureController {
	
	@ApiOperation(
			value = "강의 상세 정보", 
			notes = "강의 상세 정보를 반환한다. 강의 번호에 해당하는 강의가 없으면 null 반환")
	@GetMapping("/{lectureNo}")
	public ResponseEntity<ResponseLectureDetail> getLecture(@PathVariable() int lectureNo) {
		// 강사 번호를 이용해 강사 이름을 조회해서 dto에 담아준다.
		// 사용자가 해당 강의를 듣는지도 조회하고 수강중이면 isEnrolled를 true로 한다.
		return null;
		
	}
	
	@ApiOperation(
			value = "강의 주차별 목차 불러오기", 
			notes = "강의 주차별 목차를 불러온다. 권한이 없으면(로그인 안 함) 강의 자료는 볼 수 없다.")
	@GetMapping("/{lectureNo}/weekly")
	public ResponseEntity<List<ResponseWeeklyInfo>> getWeeklyInfoList(@PathVariable() int lectureNo) {
		return null;
		
	}
	
	@ApiOperation(
			value = "수강 신청 요청", 
			notes = "수강 신청 요청을 처리한다.. 성공하면 true, 실패하면 false 반환")
	@PostMapping("/{lectureNo}")
	public ResponseEntity<Boolean> enrollLecture(@PathVariable() int lectureNo) {
		// 수강 신청 매핑 테이블에 잘 추가하자
		return null;
		
	}
	
	@ApiOperation(
			value = "강의 수강 취소", 
			notes = "수강 취소 요청을 처리한다. 성공하면 true, 실패하면 false 반환")
	@DeleteMapping("/{lectureNo}")
	public ResponseEntity<Boolean> cancelLecture(@PathVariable() int lectureNo) {
		// 수강 신청 매핑 테이블에 잘 삭제하자
		return null;
		
	}
}