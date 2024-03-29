// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.response.proto

package com.ctrip.flight.agg.shopping.contract.transportation.response;

/**
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.response.MealType}
 */
public  final class MealType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.response.MealType)
    MealTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MealType.newBuilder() to construct.
  private MealType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MealType() {
    mealTypeEterm_ = "";
    displayType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MealType(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            mealTypeEterm_ = s;
            break;
          }
          case 16: {

            displayType_ = input.readInt32();
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
    return com.ctrip.flight.agg.shopping.contract.transportation.response.ComCtripFlightAggShoppingContractTransportationResponse.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_response_MealType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.response.ComCtripFlightAggShoppingContractTransportationResponse.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_response_MealType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.response.MealType.class, com.ctrip.flight.agg.shopping.contract.transportation.response.MealType.Builder.class);
  }

  public static final int MEALTYPEETERM_FIELD_NUMBER = 1;
  private volatile java.lang.Object mealTypeEterm_;
  /**
   * <pre>
   * Eterm下载的餐食标识,如B:早餐,L:午餐,D:晚餐/正餐,F:供采购的食物,C:免费酒精饮料 等等
   * </pre>
   *
   * <code>string MealTypeEterm = 1;</code>
   */
  public java.lang.String getMealTypeEterm() {
    java.lang.Object ref = mealTypeEterm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mealTypeEterm_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Eterm下载的餐食标识,如B:早餐,L:午餐,D:晚餐/正餐,F:供采购的食物,C:免费酒精饮料 等等
   * </pre>
   *
   * <code>string MealTypeEterm = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMealTypeEtermBytes() {
    java.lang.Object ref = mealTypeEterm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mealTypeEterm_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAYTYPE_FIELD_NUMBER = 2;
  private int displayType_;
  /**
   * <pre>
   * 引擎封装的餐食明细类型,如1:早餐,8:午餐,3:晚餐/正餐,4:供采购的食物,2:免费酒精饮料 等等
   * </pre>
   *
   * <code>int32 DisplayType = 2;</code>
   */
  public int getDisplayType() {
    return displayType_;
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
    if (!getMealTypeEtermBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, mealTypeEterm_);
    }
    if (displayType_ != 0) {
      output.writeInt32(2, displayType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMealTypeEtermBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, mealTypeEterm_);
    }
    if (displayType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, displayType_);
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
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.response.MealType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.response.MealType other = (com.ctrip.flight.agg.shopping.contract.transportation.response.MealType) obj;

    boolean result = true;
    result = result && getMealTypeEterm()
        .equals(other.getMealTypeEterm());
    result = result && (getDisplayType()
        == other.getDisplayType());
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
    hash = (37 * hash) + MEALTYPEETERM_FIELD_NUMBER;
    hash = (53 * hash) + getMealTypeEterm().hashCode();
    hash = (37 * hash) + DISPLAYTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayType();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.response.MealType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.MealType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.MealType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.MealType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.MealType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.MealType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.MealType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.MealType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.MealType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.MealType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.MealType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.MealType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.response.MealType prototype) {
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
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.response.MealType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.response.MealType)
      com.ctrip.flight.agg.shopping.contract.transportation.response.MealTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.response.ComCtripFlightAggShoppingContractTransportationResponse.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_response_MealType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.response.ComCtripFlightAggShoppingContractTransportationResponse.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_response_MealType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.response.MealType.class, com.ctrip.flight.agg.shopping.contract.transportation.response.MealType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.response.MealType.newBuilder()
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
      mealTypeEterm_ = "";

      displayType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.response.ComCtripFlightAggShoppingContractTransportationResponse.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_response_MealType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.response.MealType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.response.MealType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.response.MealType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.response.MealType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.response.MealType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.response.MealType result = new com.ctrip.flight.agg.shopping.contract.transportation.response.MealType(this);
      result.mealTypeEterm_ = mealTypeEterm_;
      result.displayType_ = displayType_;
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
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.response.MealType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.response.MealType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.response.MealType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.response.MealType.getDefaultInstance()) return this;
      if (!other.getMealTypeEterm().isEmpty()) {
        mealTypeEterm_ = other.mealTypeEterm_;
        onChanged();
      }
      if (other.getDisplayType() != 0) {
        setDisplayType(other.getDisplayType());
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
      com.ctrip.flight.agg.shopping.contract.transportation.response.MealType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.response.MealType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object mealTypeEterm_ = "";
    /**
     * <pre>
     * Eterm下载的餐食标识,如B:早餐,L:午餐,D:晚餐/正餐,F:供采购的食物,C:免费酒精饮料 等等
     * </pre>
     *
     * <code>string MealTypeEterm = 1;</code>
     */
    public java.lang.String getMealTypeEterm() {
      java.lang.Object ref = mealTypeEterm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mealTypeEterm_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Eterm下载的餐食标识,如B:早餐,L:午餐,D:晚餐/正餐,F:供采购的食物,C:免费酒精饮料 等等
     * </pre>
     *
     * <code>string MealTypeEterm = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMealTypeEtermBytes() {
      java.lang.Object ref = mealTypeEterm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mealTypeEterm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Eterm下载的餐食标识,如B:早餐,L:午餐,D:晚餐/正餐,F:供采购的食物,C:免费酒精饮料 等等
     * </pre>
     *
     * <code>string MealTypeEterm = 1;</code>
     */
    public Builder setMealTypeEterm(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mealTypeEterm_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Eterm下载的餐食标识,如B:早餐,L:午餐,D:晚餐/正餐,F:供采购的食物,C:免费酒精饮料 等等
     * </pre>
     *
     * <code>string MealTypeEterm = 1;</code>
     */
    public Builder clearMealTypeEterm() {
      
      mealTypeEterm_ = getDefaultInstance().getMealTypeEterm();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Eterm下载的餐食标识,如B:早餐,L:午餐,D:晚餐/正餐,F:供采购的食物,C:免费酒精饮料 等等
     * </pre>
     *
     * <code>string MealTypeEterm = 1;</code>
     */
    public Builder setMealTypeEtermBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mealTypeEterm_ = value;
      onChanged();
      return this;
    }

    private int displayType_ ;
    /**
     * <pre>
     * 引擎封装的餐食明细类型,如1:早餐,8:午餐,3:晚餐/正餐,4:供采购的食物,2:免费酒精饮料 等等
     * </pre>
     *
     * <code>int32 DisplayType = 2;</code>
     */
    public int getDisplayType() {
      return displayType_;
    }
    /**
     * <pre>
     * 引擎封装的餐食明细类型,如1:早餐,8:午餐,3:晚餐/正餐,4:供采购的食物,2:免费酒精饮料 等等
     * </pre>
     *
     * <code>int32 DisplayType = 2;</code>
     */
    public Builder setDisplayType(int value) {
      
      displayType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 引擎封装的餐食明细类型,如1:早餐,8:午餐,3:晚餐/正餐,4:供采购的食物,2:免费酒精饮料 等等
     * </pre>
     *
     * <code>int32 DisplayType = 2;</code>
     */
    public Builder clearDisplayType() {
      
      displayType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.response.MealType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.response.MealType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.response.MealType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.response.MealType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.response.MealType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MealType>
      PARSER = new com.google.protobuf.AbstractParser<MealType>() {
    @java.lang.Override
    public MealType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MealType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MealType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MealType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.response.MealType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

