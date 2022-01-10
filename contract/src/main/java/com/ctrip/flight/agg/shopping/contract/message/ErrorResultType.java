// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.message.proto

package com.ctrip.flight.agg.shopping.contract.message;

/**
 * <pre>
 * 错误信息，请求成功时实体为空, 否则表示错误，其中ErrorCode标识错误原因，提示信息放入DetailErrorList
 * </pre>
 *
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.message.ErrorResultType}
 */
public  final class ErrorResultType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.message.ErrorResultType)
    ErrorResultTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ErrorResultType.newBuilder() to construct.
  private ErrorResultType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ErrorResultType() {
    errorCode_ = 0;
    errorDesc_ = "";
    detailError_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ErrorResultType(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            errorCode_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            errorDesc_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              detailError_ = new java.util.ArrayList<com.ctrip.flight.agg.shopping.contract.message.DetailErrorType>();
              mutable_bitField0_ |= 0x00000004;
            }
            detailError_.add(
                input.readMessage(com.ctrip.flight.agg.shopping.contract.message.DetailErrorType.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        detailError_ = java.util.Collections.unmodifiableList(detailError_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ctrip.flight.agg.shopping.contract.message.ComCtripFlightAggShoppingContractMessage.internal_static_com_ctrip_flight_agg_shopping_contract_message_ErrorResultType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.message.ComCtripFlightAggShoppingContractMessage.internal_static_com_ctrip_flight_agg_shopping_contract_message_ErrorResultType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.message.ErrorResultType.class, com.ctrip.flight.agg.shopping.contract.message.ErrorResultType.Builder.class);
  }

  private int bitField0_;
  public static final int ERRORCODE_FIELD_NUMBER = 1;
  private int errorCode_;
  /**
   * <code>int32 ErrorCode = 1;</code>
   */
  public int getErrorCode() {
    return errorCode_;
  }

  public static final int ERRORDESC_FIELD_NUMBER = 2;
  private volatile java.lang.Object errorDesc_;
  /**
   * <code>string ErrorDesc = 2;</code>
   */
  public java.lang.String getErrorDesc() {
    java.lang.Object ref = errorDesc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errorDesc_ = s;
      return s;
    }
  }
  /**
   * <code>string ErrorDesc = 2;</code>
   */
  public com.google.protobuf.ByteString
      getErrorDescBytes() {
    java.lang.Object ref = errorDesc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorDesc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DETAILERROR_FIELD_NUMBER = 3;
  private java.util.List<com.ctrip.flight.agg.shopping.contract.message.DetailErrorType> detailError_;
  /**
   * <pre>
   * 错误详情，请求失败时可能包含多个DetailError
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
   */
  public java.util.List<com.ctrip.flight.agg.shopping.contract.message.DetailErrorType> getDetailErrorList() {
    return detailError_;
  }
  /**
   * <pre>
   * 错误详情，请求失败时可能包含多个DetailError
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
   */
  public java.util.List<? extends com.ctrip.flight.agg.shopping.contract.message.DetailErrorTypeOrBuilder> 
      getDetailErrorOrBuilderList() {
    return detailError_;
  }
  /**
   * <pre>
   * 错误详情，请求失败时可能包含多个DetailError
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
   */
  public int getDetailErrorCount() {
    return detailError_.size();
  }
  /**
   * <pre>
   * 错误详情，请求失败时可能包含多个DetailError
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
   */
  public com.ctrip.flight.agg.shopping.contract.message.DetailErrorType getDetailError(int index) {
    return detailError_.get(index);
  }
  /**
   * <pre>
   * 错误详情，请求失败时可能包含多个DetailError
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
   */
  public com.ctrip.flight.agg.shopping.contract.message.DetailErrorTypeOrBuilder getDetailErrorOrBuilder(
      int index) {
    return detailError_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (errorCode_ != 0) {
      output.writeInt32(1, errorCode_);
    }
    if (!getErrorDescBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, errorDesc_);
    }
    for (int i = 0; i < detailError_.size(); i++) {
      output.writeMessage(3, detailError_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (errorCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, errorCode_);
    }
    if (!getErrorDescBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, errorDesc_);
    }
    for (int i = 0; i < detailError_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, detailError_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.message.ErrorResultType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.message.ErrorResultType other = (com.ctrip.flight.agg.shopping.contract.message.ErrorResultType) obj;

    boolean result = true;
    result = result && (getErrorCode()
        == other.getErrorCode());
    result = result && getErrorDesc()
        .equals(other.getErrorDesc());
    result = result && getDetailErrorList()
        .equals(other.getDetailErrorList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ERRORCODE_FIELD_NUMBER;
    hash = (53 * hash) + getErrorCode();
    hash = (37 * hash) + ERRORDESC_FIELD_NUMBER;
    hash = (53 * hash) + getErrorDesc().hashCode();
    if (getDetailErrorCount() > 0) {
      hash = (37 * hash) + DETAILERROR_FIELD_NUMBER;
      hash = (53 * hash) + getDetailErrorList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.message.ErrorResultType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.message.ErrorResultType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.message.ErrorResultType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.message.ErrorResultType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.message.ErrorResultType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.message.ErrorResultType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.message.ErrorResultType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.message.ErrorResultType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.message.ErrorResultType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.message.ErrorResultType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.message.ErrorResultType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.message.ErrorResultType parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.message.ErrorResultType prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * 错误信息，请求成功时实体为空, 否则表示错误，其中ErrorCode标识错误原因，提示信息放入DetailErrorList
   * </pre>
   *
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.message.ErrorResultType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.message.ErrorResultType)
      com.ctrip.flight.agg.shopping.contract.message.ErrorResultTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.message.ComCtripFlightAggShoppingContractMessage.internal_static_com_ctrip_flight_agg_shopping_contract_message_ErrorResultType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.message.ComCtripFlightAggShoppingContractMessage.internal_static_com_ctrip_flight_agg_shopping_contract_message_ErrorResultType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.message.ErrorResultType.class, com.ctrip.flight.agg.shopping.contract.message.ErrorResultType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.message.ErrorResultType.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getDetailErrorFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      errorCode_ = 0;

      errorDesc_ = "";

      if (detailErrorBuilder_ == null) {
        detailError_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        detailErrorBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.message.ComCtripFlightAggShoppingContractMessage.internal_static_com_ctrip_flight_agg_shopping_contract_message_ErrorResultType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.message.ErrorResultType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.message.ErrorResultType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.message.ErrorResultType build() {
      com.ctrip.flight.agg.shopping.contract.message.ErrorResultType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.message.ErrorResultType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.message.ErrorResultType result = new com.ctrip.flight.agg.shopping.contract.message.ErrorResultType(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.errorCode_ = errorCode_;
      result.errorDesc_ = errorDesc_;
      if (detailErrorBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          detailError_ = java.util.Collections.unmodifiableList(detailError_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.detailError_ = detailError_;
      } else {
        result.detailError_ = detailErrorBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ctrip.flight.agg.shopping.contract.message.ErrorResultType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.message.ErrorResultType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.message.ErrorResultType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.message.ErrorResultType.getDefaultInstance()) return this;
      if (other.getErrorCode() != 0) {
        setErrorCode(other.getErrorCode());
      }
      if (!other.getErrorDesc().isEmpty()) {
        errorDesc_ = other.errorDesc_;
        onChanged();
      }
      if (detailErrorBuilder_ == null) {
        if (!other.detailError_.isEmpty()) {
          if (detailError_.isEmpty()) {
            detailError_ = other.detailError_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureDetailErrorIsMutable();
            detailError_.addAll(other.detailError_);
          }
          onChanged();
        }
      } else {
        if (!other.detailError_.isEmpty()) {
          if (detailErrorBuilder_.isEmpty()) {
            detailErrorBuilder_.dispose();
            detailErrorBuilder_ = null;
            detailError_ = other.detailError_;
            bitField0_ = (bitField0_ & ~0x00000004);
            detailErrorBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDetailErrorFieldBuilder() : null;
          } else {
            detailErrorBuilder_.addAllMessages(other.detailError_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.ctrip.flight.agg.shopping.contract.message.ErrorResultType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.message.ErrorResultType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int errorCode_ ;
    /**
     * <code>int32 ErrorCode = 1;</code>
     */
    public int getErrorCode() {
      return errorCode_;
    }
    /**
     * <code>int32 ErrorCode = 1;</code>
     */
    public Builder setErrorCode(int value) {
      
      errorCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ErrorCode = 1;</code>
     */
    public Builder clearErrorCode() {
      
      errorCode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object errorDesc_ = "";
    /**
     * <code>string ErrorDesc = 2;</code>
     */
    public java.lang.String getErrorDesc() {
      java.lang.Object ref = errorDesc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorDesc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ErrorDesc = 2;</code>
     */
    public com.google.protobuf.ByteString
        getErrorDescBytes() {
      java.lang.Object ref = errorDesc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorDesc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ErrorDesc = 2;</code>
     */
    public Builder setErrorDesc(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      errorDesc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ErrorDesc = 2;</code>
     */
    public Builder clearErrorDesc() {
      
      errorDesc_ = getDefaultInstance().getErrorDesc();
      onChanged();
      return this;
    }
    /**
     * <code>string ErrorDesc = 2;</code>
     */
    public Builder setErrorDescBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      errorDesc_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.ctrip.flight.agg.shopping.contract.message.DetailErrorType> detailError_ =
      java.util.Collections.emptyList();
    private void ensureDetailErrorIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        detailError_ = new java.util.ArrayList<com.ctrip.flight.agg.shopping.contract.message.DetailErrorType>(detailError_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.flight.agg.shopping.contract.message.DetailErrorType, com.ctrip.flight.agg.shopping.contract.message.DetailErrorType.Builder, com.ctrip.flight.agg.shopping.contract.message.DetailErrorTypeOrBuilder> detailErrorBuilder_;

    /**
     * <pre>
     * 错误详情，请求失败时可能包含多个DetailError
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
     */
    public java.util.List<com.ctrip.flight.agg.shopping.contract.message.DetailErrorType> getDetailErrorList() {
      if (detailErrorBuilder_ == null) {
        return java.util.Collections.unmodifiableList(detailError_);
      } else {
        return detailErrorBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 错误详情，请求失败时可能包含多个DetailError
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
     */
    public int getDetailErrorCount() {
      if (detailErrorBuilder_ == null) {
        return detailError_.size();
      } else {
        return detailErrorBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 错误详情，请求失败时可能包含多个DetailError
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.message.DetailErrorType getDetailError(int index) {
      if (detailErrorBuilder_ == null) {
        return detailError_.get(index);
      } else {
        return detailErrorBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 错误详情，请求失败时可能包含多个DetailError
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
     */
    public Builder setDetailError(
        int index, com.ctrip.flight.agg.shopping.contract.message.DetailErrorType value) {
      if (detailErrorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDetailErrorIsMutable();
        detailError_.set(index, value);
        onChanged();
      } else {
        detailErrorBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 错误详情，请求失败时可能包含多个DetailError
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
     */
    public Builder setDetailError(
        int index, com.ctrip.flight.agg.shopping.contract.message.DetailErrorType.Builder builderForValue) {
      if (detailErrorBuilder_ == null) {
        ensureDetailErrorIsMutable();
        detailError_.set(index, builderForValue.build());
        onChanged();
      } else {
        detailErrorBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 错误详情，请求失败时可能包含多个DetailError
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
     */
    public Builder addDetailError(com.ctrip.flight.agg.shopping.contract.message.DetailErrorType value) {
      if (detailErrorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDetailErrorIsMutable();
        detailError_.add(value);
        onChanged();
      } else {
        detailErrorBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 错误详情，请求失败时可能包含多个DetailError
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
     */
    public Builder addDetailError(
        int index, com.ctrip.flight.agg.shopping.contract.message.DetailErrorType value) {
      if (detailErrorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDetailErrorIsMutable();
        detailError_.add(index, value);
        onChanged();
      } else {
        detailErrorBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 错误详情，请求失败时可能包含多个DetailError
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
     */
    public Builder addDetailError(
        com.ctrip.flight.agg.shopping.contract.message.DetailErrorType.Builder builderForValue) {
      if (detailErrorBuilder_ == null) {
        ensureDetailErrorIsMutable();
        detailError_.add(builderForValue.build());
        onChanged();
      } else {
        detailErrorBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 错误详情，请求失败时可能包含多个DetailError
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
     */
    public Builder addDetailError(
        int index, com.ctrip.flight.agg.shopping.contract.message.DetailErrorType.Builder builderForValue) {
      if (detailErrorBuilder_ == null) {
        ensureDetailErrorIsMutable();
        detailError_.add(index, builderForValue.build());
        onChanged();
      } else {
        detailErrorBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 错误详情，请求失败时可能包含多个DetailError
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
     */
    public Builder addAllDetailError(
        java.lang.Iterable<? extends com.ctrip.flight.agg.shopping.contract.message.DetailErrorType> values) {
      if (detailErrorBuilder_ == null) {
        ensureDetailErrorIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, detailError_);
        onChanged();
      } else {
        detailErrorBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 错误详情，请求失败时可能包含多个DetailError
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
     */
    public Builder clearDetailError() {
      if (detailErrorBuilder_ == null) {
        detailError_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        detailErrorBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 错误详情，请求失败时可能包含多个DetailError
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
     */
    public Builder removeDetailError(int index) {
      if (detailErrorBuilder_ == null) {
        ensureDetailErrorIsMutable();
        detailError_.remove(index);
        onChanged();
      } else {
        detailErrorBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 错误详情，请求失败时可能包含多个DetailError
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.message.DetailErrorType.Builder getDetailErrorBuilder(
        int index) {
      return getDetailErrorFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 错误详情，请求失败时可能包含多个DetailError
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.message.DetailErrorTypeOrBuilder getDetailErrorOrBuilder(
        int index) {
      if (detailErrorBuilder_ == null) {
        return detailError_.get(index);  } else {
        return detailErrorBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 错误详情，请求失败时可能包含多个DetailError
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
     */
    public java.util.List<? extends com.ctrip.flight.agg.shopping.contract.message.DetailErrorTypeOrBuilder> 
         getDetailErrorOrBuilderList() {
      if (detailErrorBuilder_ != null) {
        return detailErrorBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(detailError_);
      }
    }
    /**
     * <pre>
     * 错误详情，请求失败时可能包含多个DetailError
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.message.DetailErrorType.Builder addDetailErrorBuilder() {
      return getDetailErrorFieldBuilder().addBuilder(
          com.ctrip.flight.agg.shopping.contract.message.DetailErrorType.getDefaultInstance());
    }
    /**
     * <pre>
     * 错误详情，请求失败时可能包含多个DetailError
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.message.DetailErrorType.Builder addDetailErrorBuilder(
        int index) {
      return getDetailErrorFieldBuilder().addBuilder(
          index, com.ctrip.flight.agg.shopping.contract.message.DetailErrorType.getDefaultInstance());
    }
    /**
     * <pre>
     * 错误详情，请求失败时可能包含多个DetailError
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.message.DetailErrorType DetailError = 3;</code>
     */
    public java.util.List<com.ctrip.flight.agg.shopping.contract.message.DetailErrorType.Builder> 
         getDetailErrorBuilderList() {
      return getDetailErrorFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.flight.agg.shopping.contract.message.DetailErrorType, com.ctrip.flight.agg.shopping.contract.message.DetailErrorType.Builder, com.ctrip.flight.agg.shopping.contract.message.DetailErrorTypeOrBuilder> 
        getDetailErrorFieldBuilder() {
      if (detailErrorBuilder_ == null) {
        detailErrorBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ctrip.flight.agg.shopping.contract.message.DetailErrorType, com.ctrip.flight.agg.shopping.contract.message.DetailErrorType.Builder, com.ctrip.flight.agg.shopping.contract.message.DetailErrorTypeOrBuilder>(
                detailError_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        detailError_ = null;
      }
      return detailErrorBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.message.ErrorResultType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.message.ErrorResultType)
  private static final com.ctrip.flight.agg.shopping.contract.message.ErrorResultType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.message.ErrorResultType();
  }

  public static com.ctrip.flight.agg.shopping.contract.message.ErrorResultType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ErrorResultType>
      PARSER = new com.google.protobuf.AbstractParser<ErrorResultType>() {
    @java.lang.Override
    public ErrorResultType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ErrorResultType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ErrorResultType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ErrorResultType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.message.ErrorResultType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

