// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.response.proto

package com.ctrip.flight.agg.shopping.contract.transportation.response;

/**
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.response.PataType}
 */
public  final class PataType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.response.PataType)
    PataTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PataType.newBuilder() to construct.
  private PataType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PataType() {
    basePrice_ = 0D;
    downFloatOption_ = 0;
    downFloatValue_ = 0;
    priceValue_ = 0;
    verifyPriceOption_ = 0;
    verifyOffsetValue_ = 0D;
    pataCode_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PataType(
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
          case 9: {

            basePrice_ = input.readDouble();
            break;
          }
          case 16: {

            downFloatOption_ = input.readInt32();
            break;
          }
          case 24: {

            downFloatValue_ = input.readInt32();
            break;
          }
          case 32: {

            priceValue_ = input.readInt32();
            break;
          }
          case 40: {

            verifyPriceOption_ = input.readInt32();
            break;
          }
          case 49: {

            verifyOffsetValue_ = input.readDouble();
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            pataCode_ = s;
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
    return com.ctrip.flight.agg.shopping.contract.transportation.response.ComCtripFlightAggShoppingContractTransportationResponse.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_response_PataType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.response.ComCtripFlightAggShoppingContractTransportationResponse.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_response_PataType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.response.PataType.class, com.ctrip.flight.agg.shopping.contract.transportation.response.PataType.Builder.class);
  }

  public static final int BASEPRICE_FIELD_NUMBER = 1;
  private double basePrice_;
  /**
   * <pre>
   **
   *pata基准价格
   * </pre>
   *
   * <code>double BasePrice = 1;</code>
   */
  public double getBasePrice() {
    return basePrice_;
  }

  public static final int DOWNFLOATOPTION_FIELD_NUMBER = 2;
  private int downFloatOption_;
  /**
   * <pre>
   **
   *下浮选项（绝对值/比例）0-比例,1-绝对值
   * </pre>
   *
   * <code>int32 DownFloatOption = 2;</code>
   */
  public int getDownFloatOption() {
    return downFloatOption_;
  }

  public static final int DOWNFLOATVALUE_FIELD_NUMBER = 3;
  private int downFloatValue_;
  /**
   * <pre>
   **
   *下浮值（具体绝对值/比例）
   * </pre>
   *
   * <code>int32 DownFloatValue = 3;</code>
   */
  public int getDownFloatValue() {
    return downFloatValue_;
  }

  public static final int PRICEVALUE_FIELD_NUMBER = 4;
  private int priceValue_;
  /**
   * <pre>
   **
   *Pata价格上浮控制值
   * </pre>
   *
   * <code>int32 PriceValue = 4;</code>
   */
  public int getPriceValue() {
    return priceValue_;
  }

  public static final int VERIFYPRICEOPTION_FIELD_NUMBER = 5;
  private int verifyPriceOption_;
  /**
   * <pre>
   **
   *PATA验价上浮控制选项，0-比例、1-绝对值
   * </pre>
   *
   * <code>int32 VerifyPriceOption = 5;</code>
   */
  public int getVerifyPriceOption() {
    return verifyPriceOption_;
  }

  public static final int VERIFYOFFSETVALUE_FIELD_NUMBER = 6;
  private double verifyOffsetValue_;
  /**
   * <pre>
   **
   *PATA验价上浮控制的数值
   * </pre>
   *
   * <code>double VerifyOffsetValue = 6;</code>
   */
  public double getVerifyOffsetValue() {
    return verifyOffsetValue_;
  }

  public static final int PATACODE_FIELD_NUMBER = 7;
  private volatile java.lang.Object pataCode_;
  /**
   * <pre>
   **
   *PATA特殊指令，由平台随政策录入，引擎及Agg透传，下单落地，对接及后处理解析
   * </pre>
   *
   * <code>string PataCode = 7;</code>
   */
  public java.lang.String getPataCode() {
    java.lang.Object ref = pataCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pataCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   **
   *PATA特殊指令，由平台随政策录入，引擎及Agg透传，下单落地，对接及后处理解析
   * </pre>
   *
   * <code>string PataCode = 7;</code>
   */
  public com.google.protobuf.ByteString
      getPataCodeBytes() {
    java.lang.Object ref = pataCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pataCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (basePrice_ != 0D) {
      output.writeDouble(1, basePrice_);
    }
    if (downFloatOption_ != 0) {
      output.writeInt32(2, downFloatOption_);
    }
    if (downFloatValue_ != 0) {
      output.writeInt32(3, downFloatValue_);
    }
    if (priceValue_ != 0) {
      output.writeInt32(4, priceValue_);
    }
    if (verifyPriceOption_ != 0) {
      output.writeInt32(5, verifyPriceOption_);
    }
    if (verifyOffsetValue_ != 0D) {
      output.writeDouble(6, verifyOffsetValue_);
    }
    if (!getPataCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, pataCode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (basePrice_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, basePrice_);
    }
    if (downFloatOption_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, downFloatOption_);
    }
    if (downFloatValue_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, downFloatValue_);
    }
    if (priceValue_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, priceValue_);
    }
    if (verifyPriceOption_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, verifyPriceOption_);
    }
    if (verifyOffsetValue_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, verifyOffsetValue_);
    }
    if (!getPataCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, pataCode_);
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
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.response.PataType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.response.PataType other = (com.ctrip.flight.agg.shopping.contract.transportation.response.PataType) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getBasePrice())
        == java.lang.Double.doubleToLongBits(
            other.getBasePrice()));
    result = result && (getDownFloatOption()
        == other.getDownFloatOption());
    result = result && (getDownFloatValue()
        == other.getDownFloatValue());
    result = result && (getPriceValue()
        == other.getPriceValue());
    result = result && (getVerifyPriceOption()
        == other.getVerifyPriceOption());
    result = result && (
        java.lang.Double.doubleToLongBits(getVerifyOffsetValue())
        == java.lang.Double.doubleToLongBits(
            other.getVerifyOffsetValue()));
    result = result && getPataCode()
        .equals(other.getPataCode());
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
    hash = (37 * hash) + BASEPRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBasePrice()));
    hash = (37 * hash) + DOWNFLOATOPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDownFloatOption();
    hash = (37 * hash) + DOWNFLOATVALUE_FIELD_NUMBER;
    hash = (53 * hash) + getDownFloatValue();
    hash = (37 * hash) + PRICEVALUE_FIELD_NUMBER;
    hash = (53 * hash) + getPriceValue();
    hash = (37 * hash) + VERIFYPRICEOPTION_FIELD_NUMBER;
    hash = (53 * hash) + getVerifyPriceOption();
    hash = (37 * hash) + VERIFYOFFSETVALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getVerifyOffsetValue()));
    hash = (37 * hash) + PATACODE_FIELD_NUMBER;
    hash = (53 * hash) + getPataCode().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.response.PataType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.PataType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.PataType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.PataType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.PataType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.PataType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.PataType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.PataType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.PataType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.PataType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.PataType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.PataType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.response.PataType prototype) {
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
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.response.PataType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.response.PataType)
      com.ctrip.flight.agg.shopping.contract.transportation.response.PataTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.response.ComCtripFlightAggShoppingContractTransportationResponse.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_response_PataType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.response.ComCtripFlightAggShoppingContractTransportationResponse.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_response_PataType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.response.PataType.class, com.ctrip.flight.agg.shopping.contract.transportation.response.PataType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.response.PataType.newBuilder()
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
      basePrice_ = 0D;

      downFloatOption_ = 0;

      downFloatValue_ = 0;

      priceValue_ = 0;

      verifyPriceOption_ = 0;

      verifyOffsetValue_ = 0D;

      pataCode_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.response.ComCtripFlightAggShoppingContractTransportationResponse.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_response_PataType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.response.PataType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.response.PataType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.response.PataType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.response.PataType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.response.PataType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.response.PataType result = new com.ctrip.flight.agg.shopping.contract.transportation.response.PataType(this);
      result.basePrice_ = basePrice_;
      result.downFloatOption_ = downFloatOption_;
      result.downFloatValue_ = downFloatValue_;
      result.priceValue_ = priceValue_;
      result.verifyPriceOption_ = verifyPriceOption_;
      result.verifyOffsetValue_ = verifyOffsetValue_;
      result.pataCode_ = pataCode_;
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
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.response.PataType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.response.PataType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.response.PataType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.response.PataType.getDefaultInstance()) return this;
      if (other.getBasePrice() != 0D) {
        setBasePrice(other.getBasePrice());
      }
      if (other.getDownFloatOption() != 0) {
        setDownFloatOption(other.getDownFloatOption());
      }
      if (other.getDownFloatValue() != 0) {
        setDownFloatValue(other.getDownFloatValue());
      }
      if (other.getPriceValue() != 0) {
        setPriceValue(other.getPriceValue());
      }
      if (other.getVerifyPriceOption() != 0) {
        setVerifyPriceOption(other.getVerifyPriceOption());
      }
      if (other.getVerifyOffsetValue() != 0D) {
        setVerifyOffsetValue(other.getVerifyOffsetValue());
      }
      if (!other.getPataCode().isEmpty()) {
        pataCode_ = other.pataCode_;
        onChanged();
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
      com.ctrip.flight.agg.shopping.contract.transportation.response.PataType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.response.PataType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double basePrice_ ;
    /**
     * <pre>
     **
     *pata基准价格
     * </pre>
     *
     * <code>double BasePrice = 1;</code>
     */
    public double getBasePrice() {
      return basePrice_;
    }
    /**
     * <pre>
     **
     *pata基准价格
     * </pre>
     *
     * <code>double BasePrice = 1;</code>
     */
    public Builder setBasePrice(double value) {
      
      basePrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     *pata基准价格
     * </pre>
     *
     * <code>double BasePrice = 1;</code>
     */
    public Builder clearBasePrice() {
      
      basePrice_ = 0D;
      onChanged();
      return this;
    }

    private int downFloatOption_ ;
    /**
     * <pre>
     **
     *下浮选项（绝对值/比例）0-比例,1-绝对值
     * </pre>
     *
     * <code>int32 DownFloatOption = 2;</code>
     */
    public int getDownFloatOption() {
      return downFloatOption_;
    }
    /**
     * <pre>
     **
     *下浮选项（绝对值/比例）0-比例,1-绝对值
     * </pre>
     *
     * <code>int32 DownFloatOption = 2;</code>
     */
    public Builder setDownFloatOption(int value) {
      
      downFloatOption_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     *下浮选项（绝对值/比例）0-比例,1-绝对值
     * </pre>
     *
     * <code>int32 DownFloatOption = 2;</code>
     */
    public Builder clearDownFloatOption() {
      
      downFloatOption_ = 0;
      onChanged();
      return this;
    }

    private int downFloatValue_ ;
    /**
     * <pre>
     **
     *下浮值（具体绝对值/比例）
     * </pre>
     *
     * <code>int32 DownFloatValue = 3;</code>
     */
    public int getDownFloatValue() {
      return downFloatValue_;
    }
    /**
     * <pre>
     **
     *下浮值（具体绝对值/比例）
     * </pre>
     *
     * <code>int32 DownFloatValue = 3;</code>
     */
    public Builder setDownFloatValue(int value) {
      
      downFloatValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     *下浮值（具体绝对值/比例）
     * </pre>
     *
     * <code>int32 DownFloatValue = 3;</code>
     */
    public Builder clearDownFloatValue() {
      
      downFloatValue_ = 0;
      onChanged();
      return this;
    }

    private int priceValue_ ;
    /**
     * <pre>
     **
     *Pata价格上浮控制值
     * </pre>
     *
     * <code>int32 PriceValue = 4;</code>
     */
    public int getPriceValue() {
      return priceValue_;
    }
    /**
     * <pre>
     **
     *Pata价格上浮控制值
     * </pre>
     *
     * <code>int32 PriceValue = 4;</code>
     */
    public Builder setPriceValue(int value) {
      
      priceValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     *Pata价格上浮控制值
     * </pre>
     *
     * <code>int32 PriceValue = 4;</code>
     */
    public Builder clearPriceValue() {
      
      priceValue_ = 0;
      onChanged();
      return this;
    }

    private int verifyPriceOption_ ;
    /**
     * <pre>
     **
     *PATA验价上浮控制选项，0-比例、1-绝对值
     * </pre>
     *
     * <code>int32 VerifyPriceOption = 5;</code>
     */
    public int getVerifyPriceOption() {
      return verifyPriceOption_;
    }
    /**
     * <pre>
     **
     *PATA验价上浮控制选项，0-比例、1-绝对值
     * </pre>
     *
     * <code>int32 VerifyPriceOption = 5;</code>
     */
    public Builder setVerifyPriceOption(int value) {
      
      verifyPriceOption_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     *PATA验价上浮控制选项，0-比例、1-绝对值
     * </pre>
     *
     * <code>int32 VerifyPriceOption = 5;</code>
     */
    public Builder clearVerifyPriceOption() {
      
      verifyPriceOption_ = 0;
      onChanged();
      return this;
    }

    private double verifyOffsetValue_ ;
    /**
     * <pre>
     **
     *PATA验价上浮控制的数值
     * </pre>
     *
     * <code>double VerifyOffsetValue = 6;</code>
     */
    public double getVerifyOffsetValue() {
      return verifyOffsetValue_;
    }
    /**
     * <pre>
     **
     *PATA验价上浮控制的数值
     * </pre>
     *
     * <code>double VerifyOffsetValue = 6;</code>
     */
    public Builder setVerifyOffsetValue(double value) {
      
      verifyOffsetValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     *PATA验价上浮控制的数值
     * </pre>
     *
     * <code>double VerifyOffsetValue = 6;</code>
     */
    public Builder clearVerifyOffsetValue() {
      
      verifyOffsetValue_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object pataCode_ = "";
    /**
     * <pre>
     **
     *PATA特殊指令，由平台随政策录入，引擎及Agg透传，下单落地，对接及后处理解析
     * </pre>
     *
     * <code>string PataCode = 7;</code>
     */
    public java.lang.String getPataCode() {
      java.lang.Object ref = pataCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pataCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     **
     *PATA特殊指令，由平台随政策录入，引擎及Agg透传，下单落地，对接及后处理解析
     * </pre>
     *
     * <code>string PataCode = 7;</code>
     */
    public com.google.protobuf.ByteString
        getPataCodeBytes() {
      java.lang.Object ref = pataCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pataCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     **
     *PATA特殊指令，由平台随政策录入，引擎及Agg透传，下单落地，对接及后处理解析
     * </pre>
     *
     * <code>string PataCode = 7;</code>
     */
    public Builder setPataCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pataCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     *PATA特殊指令，由平台随政策录入，引擎及Agg透传，下单落地，对接及后处理解析
     * </pre>
     *
     * <code>string PataCode = 7;</code>
     */
    public Builder clearPataCode() {
      
      pataCode_ = getDefaultInstance().getPataCode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     *PATA特殊指令，由平台随政策录入，引擎及Agg透传，下单落地，对接及后处理解析
     * </pre>
     *
     * <code>string PataCode = 7;</code>
     */
    public Builder setPataCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pataCode_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.response.PataType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.response.PataType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.response.PataType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.response.PataType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.response.PataType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PataType>
      PARSER = new com.google.protobuf.AbstractParser<PataType>() {
    @java.lang.Override
    public PataType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PataType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PataType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PataType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.response.PataType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

