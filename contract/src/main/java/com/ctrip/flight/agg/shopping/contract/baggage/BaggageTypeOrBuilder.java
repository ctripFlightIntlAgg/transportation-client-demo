// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.baggage.proto

package com.ctrip.flight.agg.shopping.contract.baggage;

public interface BaggageTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.baggage.BaggageType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 RefNum = 1;</code>
   */
  int getRefNum();

  /**
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType BaggageDetail = 2;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType> 
      getBaggageDetailList();
  /**
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType BaggageDetail = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType getBaggageDetail(int index);
  /**
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType BaggageDetail = 2;</code>
   */
  int getBaggageDetailCount();
  /**
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType BaggageDetail = 2;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailTypeOrBuilder> 
      getBaggageDetailOrBuilderList();
  /**
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType BaggageDetail = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailTypeOrBuilder getBaggageDetailOrBuilder(
      int index);

  /**
   * <code>.com.ctrip.flight.agg.shopping.contract.baggage.BaggageExtensionFieldsType ExtensionFields = 3;</code>
   */
  boolean hasExtensionFields();
  /**
   * <code>.com.ctrip.flight.agg.shopping.contract.baggage.BaggageExtensionFieldsType ExtensionFields = 3;</code>
   */
  com.ctrip.flight.agg.shopping.contract.baggage.BaggageExtensionFieldsType getExtensionFields();
  /**
   * <code>.com.ctrip.flight.agg.shopping.contract.baggage.BaggageExtensionFieldsType ExtensionFields = 3;</code>
   */
  com.ctrip.flight.agg.shopping.contract.baggage.BaggageExtensionFieldsTypeOrBuilder getExtensionFieldsOrBuilder();

  /**
   * <code>.com.ctrip.flight.agg.shopping.contract.baggage.BaggageSizeType BaggageSize = 4;</code>
   */
  boolean hasBaggageSize();
  /**
   * <code>.com.ctrip.flight.agg.shopping.contract.baggage.BaggageSizeType BaggageSize = 4;</code>
   */
  com.ctrip.flight.agg.shopping.contract.baggage.BaggageSizeType getBaggageSize();
  /**
   * <code>.com.ctrip.flight.agg.shopping.contract.baggage.BaggageSizeType BaggageSize = 4;</code>
   */
  com.ctrip.flight.agg.shopping.contract.baggage.BaggageSizeTypeOrBuilder getBaggageSizeOrBuilder();
}
