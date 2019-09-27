package kr.co.model;

import java.util.ArrayList;

import kr.co.controller.UserForm;

public class UserManager { //여러개의 DAO를 관리하기 위한 목적
	private static UserManager manager = new UserManager();
	public static UserManager instance() {
		return manager;
	}
	
	private UserDaoModel getUserdaoModel() { //유저모델에 대한 객체생성 (외부에서 접근을 못하게함)
		return new UserDaoModel();
	}
	
	public boolean login(String user_id, String user_passwd) { //로그인
		UserDto dto = getUserdaoModel().findUser(user_id);

		
		if(dto == null) return false;
		if(dto.getPassword().equals(user_passwd)) 
			return true;
		else
			return false;
	}
	
	public ArrayList<UserDto> getUserAll(){ //전체이용자 보는것
		return getUserdaoModel().getuserAll();
	}
	
	public int insert(UserForm userForm) { //회원가입
		return getUserdaoModel().insertData(userForm);
	}
	
	public int update(UserForm userForm) { //회원정보수정
		return getUserdaoModel().updateData(userForm);
	}
	
	public UserDto findUser(String userid) { //상세보기
		return getUserdaoModel().findUser(userid);
	}
	
	public int delete(String userid) { //회원가입삭제
		return getUserdaoModel().deleteData(userid);
	}
}
