// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

/**
 * <pre>
 * 价格上浮调整
 * </pre>
 *
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType}
 */
public  final class FloatUpType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType)
    FloatUpTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FloatUpType.newBuilder() to construct.
  private FloatUpType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FloatUpType() {
    refNum_ = 0;
    product_ = 0;
    amount_ = 0D;
    remark_ = "";
    deliveryCode_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FloatUpType(
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

            refNum_ = input.readInt32();
            break;
          }
          case 16: {

            product_ = input.readInt32();
            break;
          }
          case 25: {

            amount_ = input.readDouble();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            remark_ = s;
            break;
          }
          case 40: {

            deliveryCode_ = input.readInt32();
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
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_FloatUpType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_FloatUpType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType.class, com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType.Builder.class);
  }

  public static final int REFNUM_FIELD_NUMBER = 1;
  private int refNum_;
  /**
   * <pre>
   * 引用关联关系
   * </pre>
   *
   * <code>int32 RefNum = 1;</code>
   */
  public int getRefNum() {
    return refNum_;
  }

  public static final int PRODUCT_FIELD_NUMBER = 2;
  private int product_;
  /**
   * <pre>
   * 产品类型 0任我行 1任我游 2返现
   * </pre>
   *
   * <code>int32 Product = 2;</code>
   */
  public int getProduct() {
    return product_;
  }

  public static final int AMOUNT_FIELD_NUMBER = 3;
  private double amount_;
  /**
   * <pre>
   * 礼品卡返现等的金额
   * </pre>
   *
   * <code>double Amount = 3;</code>
   */
  public double getAmount() {
    return amount_;
  }

  public static final int REMARK_FIELD_NUMBER = 4;
  private volatile java.lang.Object remark_;
  /**
   * <pre>
   * 备注
   * </pre>
   *
   * <code>string Remark = 4;</code>
   */
  public java.lang.String getRemark() {
    java.lang.Object ref = remark_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      remark_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 备注
   * </pre>
   *
   * <code>string Remark = 4;</code>
   */
  public com.google.protobuf.ByteString
      getRemarkBytes() {
    java.lang.Object ref = remark_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      remark_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DELIVERYCODE_FIELD_NUMBER = 5;
  private int deliveryCode_;
  /**
   * <pre>
   * 配送费说明 0：免配送费 1：收取配送费
   * </pre>
   *
   * <code>int32 DeliveryCode = 5;</code>
   */
  public int getDeliveryCode() {
    return deliveryCode_;
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
    if (refNum_ != 0) {
      output.writeInt32(1, refNum_);
    }
    if (product_ != 0) {
      output.writeInt32(2, product_);
    }
    if (amount_ != 0D) {
      output.writeDouble(3, amount_);
    }
    if (!getRemarkBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, remark_);
    }
    if (deliveryCode_ != 0) {
      output.writeInt32(5, deliveryCode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (refNum_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, refNum_);
    }
    if (product_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, product_);
    }
    if (amount_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, amount_);
    }
    if (!getRemarkBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, remark_);
    }
    if (deliveryCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, deliveryCode_);
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
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType other = (com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType) obj;

    boolean result = true;
    result = result && (getRefNum()
        == other.getRefNum());
    result = result && (getProduct()
        == other.getProduct());
    result = result && (
        java.lang.Double.doubleToLongBits(getAmount())
        == java.lang.Double.doubleToLongBits(
            other.getAmount()));
    result = result && getRemark()
        .equals(other.getRemark());
    result = result && (getDeliveryCode()
        == other.getDeliveryCode());
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
    hash = (37 * hash) + REFNUM_FIELD_NUMBER;
    hash = (53 * hash) + getRefNum();
    hash = (37 * hash) + PRODUCT_FIELD_NUMBER;
    hash = (53 * hash) + getProduct();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAmount()));
    hash = (37 * hash) + REMARK_FIELD_NUMBER;
    hash = (53 * hash) + getRemark().hashCode();
    hash = (37 * hash) + DELIVERYCODE_FIELD_NUMBER;
    hash = (53 * hash) + getDeliveryCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType prototype) {
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
   * 价格上浮调整
   * </pre>
   *
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType)
      com.ctrip.flight.agg.shopping.contract.transportation.FloatUpTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_FloatUpType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_FloatUpType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType.class, com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType.newBuilder()
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
      refNum_ = 0;

      product_ = 0;

      amount_ = 0D;

      remark_ = "";

      deliveryCode_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_FloatUpType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType result = new com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType(this);
      result.refNum_ = refNum_;
      result.product_ = product_;
      result.amount_ = amount_;
      result.remark_ = remark_;
      result.deliveryCode_ = deliveryCode_;
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
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType.getDefaultInstance()) return this;
      if (other.getRefNum() != 0) {
        setRefNum(other.getRefNum());
      }
      if (other.getProduct() != 0) {
        setProduct(other.getProduct());
      }
      if (other.getAmount() != 0D) {
        setAmount(other.getAmount());
      }
      if (!other.getRemark().isEmpty()) {
        remark_ = other.remark_;
        onChanged();
      }
      if (other.getDeliveryCode() != 0) {
        setDeliveryCode(other.getDeliveryCode());
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
      com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int refNum_ ;
    /**
     * <pre>
     * 引用关联关系
     * </pre>
     *
     * <code>int32 RefNum = 1;</code>
     */
    public int getRefNum() {
      return refNum_;
    }
    /**
     * <pre>
     * 引用关联关系
     * </pre>
     *
     * <code>int32 RefNum = 1;</code>
     */
    public Builder setRefNum(int value) {
      
      refNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 引用关联关系
     * </pre>
     *
     * <code>int32 RefNum = 1;</code>
     */
    public Builder clearRefNum() {
      
      refNum_ = 0;
      onChanged();
      return this;
    }

    private int product_ ;
    /**
     * <pre>
     * 产品类型 0任我行 1任我游 2返现
     * </pre>
     *
     * <code>int32 Product = 2;</code>
     */
    public int getProduct() {
      return product_;
    }
    /**
     * <pre>
     * 产品类型 0任我行 1任我游 2返现
     * </pre>
     *
     * <code>int32 Product = 2;</code>
     */
    public Builder setProduct(int value) {
      
      product_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 产品类型 0任我行 1任我游 2返现
     * </pre>
     *
     * <code>int32 Product = 2;</code>
     */
    public Builder clearProduct() {
      
      product_ = 0;
      onChanged();
      return this;
    }

    private double amount_ ;
    /**
     * <pre>
     * 礼品卡返现等的金额
     * </pre>
     *
     * <code>double Amount = 3;</code>
     */
    public double getAmount() {
      return amount_;
    }
    /**
     * <pre>
     * 礼品卡返现等的金额
     * </pre>
     *
     * <code>double Amount = 3;</code>
     */
    public Builder setAmount(double value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 礼品卡返现等的金额
     * </pre>
     *
     * <code>double Amount = 3;</code>
     */
    public Builder clearAmount() {
      
      amount_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object remark_ = "";
    /**
     * <pre>
     * 备注
     * </pre>
     *
     * <code>string Remark = 4;</code>
     */
    public java.lang.String getRemark() {
      java.lang.Object ref = remark_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        remark_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 备注
     * </pre>
     *
     * <code>string Remark = 4;</code>
     */
    public com.google.protobuf.ByteString
        getRemarkBytes() {
      java.lang.Object ref = remark_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        remark_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 备注
     * </pre>
     *
     * <code>string Remark = 4;</code>
     */
    public Builder setRemark(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      remark_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 备注
     * </pre>
     *
     * <code>string Remark = 4;</code>
     */
    public Builder clearRemark() {
      
      remark_ = getDefaultInstance().getRemark();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 备注
     * </pre>
     *
     * <code>string Remark = 4;</code>
     */
    public Builder setRemarkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      remark_ = value;
      onChanged();
      return this;
    }

    private int deliveryCode_ ;
    /**
     * <pre>
     * 配送费说明 0：免配送费 1：收取配送费
     * </pre>
     *
     * <code>int32 DeliveryCode = 5;</code>
     */
    public int getDeliveryCode() {
      return deliveryCode_;
    }
    /**
     * <pre>
     * 配送费说明 0：免配送费 1：收取配送费
     * </pre>
     *
     * <code>int32 DeliveryCode = 5;</code>
     */
    public Builder setDeliveryCode(int value) {
      
      deliveryCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 配送费说明 0：免配送费 1：收取配送费
     * </pre>
     *
     * <code>int32 DeliveryCode = 5;</code>
     */
    public Builder clearDeliveryCode() {
      
      deliveryCode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FloatUpType>
      PARSER = new com.google.protobuf.AbstractParser<FloatUpType>() {
    @java.lang.Override
    public FloatUpType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FloatUpType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FloatUpType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FloatUpType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.FloatUpType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

