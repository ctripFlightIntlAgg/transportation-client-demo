// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.response.proto

package com.ctrip.flight.agg.shopping.contract.transportation.response;

/**
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType}
 */
public  final class OrderRuleType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType)
    OrderRuleTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrderRuleType.newBuilder() to construct.
  private OrderRuleType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderRuleType() {
    type_ = 0;
    priority_ = 0;
    showType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OrderRuleType(
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

            type_ = input.readInt32();
            break;
          }
          case 16: {

            priority_ = input.readInt32();
            break;
          }
          case 24: {

            showType_ = input.readInt32();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ctrip.flight.agg.shopping.contract.transportation.response.ComCtripFlightAggShoppingContractTransportationResponse.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_response_OrderRuleType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.response.ComCtripFlightAggShoppingContractTransportationResponse.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_response_OrderRuleType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType.class, com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * 类型 1：最低价 2:服务包裸价 3:旗舰店
   * </pre>
   *
   * <code>int32 Type = 1;</code>
   */
  public int getType() {
    return type_;
  }

  public static final int PRIORITY_FIELD_NUMBER = 2;
  private int priority_;
  /**
   * <pre>
   * 优先级 1、2、3...
   * </pre>
   *
   * <code>int32 Priority = 2;</code>
   */
  public int getPriority() {
    return priority_;
  }

  public static final int SHOWTYPE_FIELD_NUMBER = 3;
  private int showType_;
  /**
   * <pre>
   * 展示类型 1：展示 2：折叠
   * </pre>
   *
   * <code>int32 ShowType = 3;</code>
   */
  public int getShowType() {
    return showType_;
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
    if (type_ != 0) {
      output.writeInt32(1, type_);
    }
    if (priority_ != 0) {
      output.writeInt32(2, priority_);
    }
    if (showType_ != 0) {
      output.writeInt32(3, showType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, type_);
    }
    if (priority_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, priority_);
    }
    if (showType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, showType_);
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
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType other = (com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType) obj;

    boolean result = true;
    result = result && (getType()
        == other.getType());
    result = result && (getPriority()
        == other.getPriority());
    result = result && (getShowType()
        == other.getShowType());
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    hash = (37 * hash) + PRIORITY_FIELD_NUMBER;
    hash = (53 * hash) + getPriority();
    hash = (37 * hash) + SHOWTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getShowType();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType prototype) {
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
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType)
      com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.response.ComCtripFlightAggShoppingContractTransportationResponse.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_response_OrderRuleType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.response.ComCtripFlightAggShoppingContractTransportationResponse.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_response_OrderRuleType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType.class, com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = 0;

      priority_ = 0;

      showType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.response.ComCtripFlightAggShoppingContractTransportationResponse.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_response_OrderRuleType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType result = new com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType(this);
      result.type_ = type_;
      result.priority_ = priority_;
      result.showType_ = showType_;
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
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType.getDefaultInstance()) return this;
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (other.getPriority() != 0) {
        setPriority(other.getPriority());
      }
      if (other.getShowType() != 0) {
        setShowType(other.getShowType());
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
      com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ ;
    /**
     * <pre>
     * 类型 1：最低价 2:服务包裸价 3:旗舰店
     * </pre>
     *
     * <code>int32 Type = 1;</code>
     */
    public int getType() {
      return type_;
    }
    /**
     * <pre>
     * 类型 1：最低价 2:服务包裸价 3:旗舰店
     * </pre>
     *
     * <code>int32 Type = 1;</code>
     */
    public Builder setType(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 类型 1：最低价 2:服务包裸价 3:旗舰店
     * </pre>
     *
     * <code>int32 Type = 1;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private int priority_ ;
    /**
     * <pre>
     * 优先级 1、2、3...
     * </pre>
     *
     * <code>int32 Priority = 2;</code>
     */
    public int getPriority() {
      return priority_;
    }
    /**
     * <pre>
     * 优先级 1、2、3...
     * </pre>
     *
     * <code>int32 Priority = 2;</code>
     */
    public Builder setPriority(int value) {
      
      priority_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 优先级 1、2、3...
     * </pre>
     *
     * <code>int32 Priority = 2;</code>
     */
    public Builder clearPriority() {
      
      priority_ = 0;
      onChanged();
      return this;
    }

    private int showType_ ;
    /**
     * <pre>
     * 展示类型 1：展示 2：折叠
     * </pre>
     *
     * <code>int32 ShowType = 3;</code>
     */
    public int getShowType() {
      return showType_;
    }
    /**
     * <pre>
     * 展示类型 1：展示 2：折叠
     * </pre>
     *
     * <code>int32 ShowType = 3;</code>
     */
    public Builder setShowType(int value) {
      
      showType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 展示类型 1：展示 2：折叠
     * </pre>
     *
     * <code>int32 ShowType = 3;</code>
     */
    public Builder clearShowType() {
      
      showType_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderRuleType>
      PARSER = new com.google.protobuf.AbstractParser<OrderRuleType>() {
    @java.lang.Override
    public OrderRuleType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OrderRuleType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OrderRuleType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderRuleType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.response.OrderRuleType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

