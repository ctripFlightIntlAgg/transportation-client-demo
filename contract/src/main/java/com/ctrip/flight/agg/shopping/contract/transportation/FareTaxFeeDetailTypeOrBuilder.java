// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface FareTaxFeeDetailTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.FareTaxFeeDetailType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * type such as:YQ、YR、E7、G8、TS
   * </pre>
   *
   * <code>string Type = 1;</code>
   */
  java.lang.String getType();
  /**
   * <pre>
   * type such as:YQ、YR、E7、G8、TS
   * </pre>
   *
   * <code>string Type = 1;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * amount
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType Amount = 2;</code>
   */
  boolean hasAmount();
  /**
   * <pre>
   * amount
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType Amount = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.AmountType getAmount();
  /**
   * <pre>
   * amount
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType Amount = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.AmountTypeOrBuilder getAmountOrBuilder();
}