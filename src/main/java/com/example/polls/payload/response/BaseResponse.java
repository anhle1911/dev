package com.example.polls.payload.response;


import com.example.polls.common.ErrorCodeDefs;

/**
 * @author AnhLH
 */
public class BaseResponse {

  protected int rc;
  protected String rd;

  public BaseResponse(int rc, String rd) {
    this.rc = rc;
    this.rd = rd;
  }
  public BaseResponse() {
    rc = ErrorCodeDefs.UNKNOWN;
    rd = "UNKNOWN";
  }

  public int getRc() {
    return rc;
  }

  public void setRc(int rc) {
    this.rc = rc;
  }

  public String getRd() {
    return rd;
  }

  public void setRd(String rd) {
    this.rd = rd;
  }

  public void setSuccess() {
    this.rc = ErrorCodeDefs.ERR_CODE_OK;
    this.rd = "OK";
  }

  public void setFailed(String msg) {
    this.rc = ErrorCodeDefs.ERR_CODE_FAILED;
    this.rd = msg;
  }

  public void setFailed(int code, String msg) {
    this.rc = code;
    this.rd = msg;
  }


  public void setFailed() {
    this.setFailed("Action failed !");
  }

  public void setUnAuthor() {
    this.rc = ErrorCodeDefs.UNAUTHORIZED;
    this.rd = "UNAUTHORIZED";
  }
  public void setExpertiseFaild() {
    this.rc = ErrorCodeDefs.ERR_CODE_EXPERTISE_FAILED;
    this.rd = "Thẩm định thất bại!! Xin đợi 1 tháng để đề xuất lại";
  }
  public void setBankCardFailed(){
    this.rc = ErrorCodeDefs.ERR_CODE_NOT_COMPLETE_BANKINFO;
    this.rd = "Chưa xác minh thông tin ngân hàng";
  }
  public void setIdentityFailed(){
    this.rc = ErrorCodeDefs.ERR_CODE_NOT_COMPLETE_IDENTITY;
    this.rd = "Chưa xác minh thông tin cá nhân";
  }
  public void setReferenceFailed(){
    this.rc = ErrorCodeDefs.ERR_CODE_NOT_COMPLETE_REFERENCE;
    this.rd = "Chưa xác minh thông tin người tham chiếu";
  }
  public void setNotCompletedFailed(){
    this.rc = ErrorCodeDefs.ERR_CODE_NOT_COMPLETE;
    this.rd = "Vẫn còn những mục chưa hoàn thành, không thể gửi thông tin trùng lặp";
  }
  public void setCannotLoanTo(long dateday,long datehour,long datemin,long datesec){
    this.rc =ErrorCodeDefs.ERR_CODE_NOT_LOAN_TO;
    this.rd = "Cách lần vay kế tiếp còn " + dateday + " ngày " + datehour + " tiếng "
        + datemin + " phút " + datesec + " giây";
  }
  public void setParamsInvalid() {
    this.setFailed(ErrorCodeDefs.ERR_CODE_PARAMS_INVALID, "Params invalid! Or Not created");
  }

  public void setServerError() {
    this.setFailed(ErrorCodeDefs.ERR_CODE_SERVER_ERROR, "Server error!");
  }

  public void setItemNotFound(String msg) {
    this.rc = ErrorCodeDefs.ERR_CODE_ITEM_NOT_FOUND;
    this.rd = msg;
  }

  public void setItemNotFound() {
    this.setItemNotFound("items not found");
  }

  @Override
  public String toString() {
    return "{" +
        "rc=" + rc +
        ", rd='" + rd + '\'' +
        '}';
  }
}
