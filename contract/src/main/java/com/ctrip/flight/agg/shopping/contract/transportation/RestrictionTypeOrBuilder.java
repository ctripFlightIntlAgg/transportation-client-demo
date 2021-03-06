// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface RestrictionTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.RestrictionType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 使用本地证件预订票的语言
   * </pre>
   *
   * <code>repeated string LanguageOfGovernmentIssuedPhotoID = 1;</code>
   */
  java.util.List<java.lang.String>
      getLanguageOfGovernmentIssuedPhotoIDList();
  /**
   * <pre>
   * 使用本地证件预订票的语言
   * </pre>
   *
   * <code>repeated string LanguageOfGovernmentIssuedPhotoID = 1;</code>
   */
  int getLanguageOfGovernmentIssuedPhotoIDCount();
  /**
   * <pre>
   * 使用本地证件预订票的语言
   * </pre>
   *
   * <code>repeated string LanguageOfGovernmentIssuedPhotoID = 1;</code>
   */
  java.lang.String getLanguageOfGovernmentIssuedPhotoID(int index);
  /**
   * <pre>
   * 使用本地证件预订票的语言
   * </pre>
   *
   * <code>repeated string LanguageOfGovernmentIssuedPhotoID = 1;</code>
   */
  com.google.protobuf.ByteString
      getLanguageOfGovernmentIssuedPhotoIDBytes(int index);

  /**
   * <pre>
   * 支付限制
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.PaymentLimitType PaymentLimit = 2;</code>
   */
  boolean hasPaymentLimit();
  /**
   * <pre>
   * 支付限制
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.PaymentLimitType PaymentLimit = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.PaymentLimitType getPaymentLimit();
  /**
   * <pre>
   * 支付限制
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.PaymentLimitType PaymentLimit = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.PaymentLimitTypeOrBuilder getPaymentLimitOrBuilder();

  /**
   * <pre>
   * 证件类型白名单，空表示不限制
   * </pre>
   *
   * <code>repeated string CertificateTypeAllow = 3;</code>
   */
  java.util.List<java.lang.String>
      getCertificateTypeAllowList();
  /**
   * <pre>
   * 证件类型白名单，空表示不限制
   * </pre>
   *
   * <code>repeated string CertificateTypeAllow = 3;</code>
   */
  int getCertificateTypeAllowCount();
  /**
   * <pre>
   * 证件类型白名单，空表示不限制
   * </pre>
   *
   * <code>repeated string CertificateTypeAllow = 3;</code>
   */
  java.lang.String getCertificateTypeAllow(int index);
  /**
   * <pre>
   * 证件类型白名单，空表示不限制
   * </pre>
   *
   * <code>repeated string CertificateTypeAllow = 3;</code>
   */
  com.google.protobuf.ByteString
      getCertificateTypeAllowBytes(int index);

  /**
   * <pre>
   * 证件类型黑名单
   * </pre>
   *
   * <code>repeated string CertificateTypeBlock = 4;</code>
   */
  java.util.List<java.lang.String>
      getCertificateTypeBlockList();
  /**
   * <pre>
   * 证件类型黑名单
   * </pre>
   *
   * <code>repeated string CertificateTypeBlock = 4;</code>
   */
  int getCertificateTypeBlockCount();
  /**
   * <pre>
   * 证件类型黑名单
   * </pre>
   *
   * <code>repeated string CertificateTypeBlock = 4;</code>
   */
  java.lang.String getCertificateTypeBlock(int index);
  /**
   * <pre>
   * 证件类型黑名单
   * </pre>
   *
   * <code>repeated string CertificateTypeBlock = 4;</code>
   */
  com.google.protobuf.ByteString
      getCertificateTypeBlockBytes(int index);

  /**
   * <pre>
   * 身份证号限制,如 "31,3
   * </pre>
   *
   * <code>string IDCardNos = 5;</code>
   */
  java.lang.String getIDCardNos();
  /**
   * <pre>
   * 身份证号限制,如 "31,3
   * </pre>
   *
   * <code>string IDCardNos = 5;</code>
   */
  com.google.protobuf.ByteString
      getIDCardNosBytes();

  /**
   * <pre>
   * 携程会员,如 "GOLD,DIAMOND"
   * </pre>
   *
   * <code>string CtripMemberships = 6;</code>
   */
  java.lang.String getCtripMemberships();
  /**
   * <pre>
   * 携程会员,如 "GOLD,DIAMOND"
   * </pre>
   *
   * <code>string CtripMemberships = 6;</code>
   */
  com.google.protobuf.ByteString
      getCtripMembershipsBytes();

  /**
   * <pre>
   * 航司或携程的会员定向投放的用户UID(定向Code), 白名单
   * </pre>
   *
   * <code>repeated string CtripAgreementIDAllow = 7;</code>
   */
  java.util.List<java.lang.String>
      getCtripAgreementIDAllowList();
  /**
   * <pre>
   * 航司或携程的会员定向投放的用户UID(定向Code), 白名单
   * </pre>
   *
   * <code>repeated string CtripAgreementIDAllow = 7;</code>
   */
  int getCtripAgreementIDAllowCount();
  /**
   * <pre>
   * 航司或携程的会员定向投放的用户UID(定向Code), 白名单
   * </pre>
   *
   * <code>repeated string CtripAgreementIDAllow = 7;</code>
   */
  java.lang.String getCtripAgreementIDAllow(int index);
  /**
   * <pre>
   * 航司或携程的会员定向投放的用户UID(定向Code), 白名单
   * </pre>
   *
   * <code>repeated string CtripAgreementIDAllow = 7;</code>
   */
  com.google.protobuf.ByteString
      getCtripAgreementIDAllowBytes(int index);

  /**
   * <pre>
   * 航司或携程的会员定向投放的用户UID(定向Code)，黑名单
   * </pre>
   *
   * <code>repeated string CtripAgreementIDBlock = 8;</code>
   */
  java.util.List<java.lang.String>
      getCtripAgreementIDBlockList();
  /**
   * <pre>
   * 航司或携程的会员定向投放的用户UID(定向Code)，黑名单
   * </pre>
   *
   * <code>repeated string CtripAgreementIDBlock = 8;</code>
   */
  int getCtripAgreementIDBlockCount();
  /**
   * <pre>
   * 航司或携程的会员定向投放的用户UID(定向Code)，黑名单
   * </pre>
   *
   * <code>repeated string CtripAgreementIDBlock = 8;</code>
   */
  java.lang.String getCtripAgreementIDBlock(int index);
  /**
   * <pre>
   * 航司或携程的会员定向投放的用户UID(定向Code)，黑名单
   * </pre>
   *
   * <code>repeated string CtripAgreementIDBlock = 8;</code>
   */
  com.google.protobuf.ByteString
      getCtripAgreementIDBlockBytes(int index);

  /**
   * <pre>
   * 直联政策产品类型标识(定向Code)
   * </pre>
   *
   * <code>string CarrierAgreementID = 9;</code>
   */
  java.lang.String getCarrierAgreementID();
  /**
   * <pre>
   * 直联政策产品类型标识(定向Code)
   * </pre>
   *
   * <code>string CarrierAgreementID = 9;</code>
   */
  com.google.protobuf.ByteString
      getCarrierAgreementIDBytes();

  /**
   * <pre>
   * 1: 团队票，2:多人直减
   * </pre>
   *
   * <code>int32 GroupTicket = 10;</code>
   */
  int getGroupTicket();

  /**
   * <pre>
   * 身份限制信息，0:无限制; 1:Student; 2:军警残
   * </pre>
   *
   * <code>int32 IdentityLimit = 11;</code>
   */
  int getIdentityLimit();
}
