// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

/**
 * <pre>
 * 站点信息
 * </pre>
 *
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.StationType}
 */
public  final class StationType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.StationType)
    StationTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StationType.newBuilder() to construct.
  private StationType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StationType() {
    type_ = "";
    stationID_ = "";
    stationName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StationType(
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

            type_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            stationID_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            stationName_ = s;
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
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_StationType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_StationType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.StationType.class, com.ctrip.flight.agg.shopping.contract.transportation.StationType.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object type_;
  /**
   * <pre>
   * 站点类型
   * </pre>
   *
   * <code>string Type = 1;</code>
   */
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 站点类型
   * </pre>
   *
   * <code>string Type = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATIONID_FIELD_NUMBER = 2;
  private volatile java.lang.Object stationID_;
  /**
   * <pre>
   * 站点id
   * </pre>
   *
   * <code>string StationID = 2;</code>
   */
  public java.lang.String getStationID() {
    java.lang.Object ref = stationID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stationID_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 站点id
   * </pre>
   *
   * <code>string StationID = 2;</code>
   */
  public com.google.protobuf.ByteString
      getStationIDBytes() {
    java.lang.Object ref = stationID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stationID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATIONNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object stationName_;
  /**
   * <pre>
   * 站点名称
   * </pre>
   *
   * <code>string StationName = 3;</code>
   */
  public java.lang.String getStationName() {
    java.lang.Object ref = stationName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stationName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 站点名称
   * </pre>
   *
   * <code>string StationName = 3;</code>
   */
  public com.google.protobuf.ByteString
      getStationNameBytes() {
    java.lang.Object ref = stationName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stationName_ = b;
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
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
    }
    if (!getStationIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, stationID_);
    }
    if (!getStationNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, stationName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
    }
    if (!getStationIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, stationID_);
    }
    if (!getStationNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, stationName_);
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
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.StationType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.StationType other = (com.ctrip.flight.agg.shopping.contract.transportation.StationType) obj;

    boolean result = true;
    result = result && getType()
        .equals(other.getType());
    result = result && getStationID()
        .equals(other.getStationID());
    result = result && getStationName()
        .equals(other.getStationName());
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
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + STATIONID_FIELD_NUMBER;
    hash = (53 * hash) + getStationID().hashCode();
    hash = (37 * hash) + STATIONNAME_FIELD_NUMBER;
    hash = (53 * hash) + getStationName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.StationType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.StationType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.StationType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.StationType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.StationType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.StationType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.StationType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.StationType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.StationType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.StationType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.StationType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.StationType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.StationType prototype) {
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
   * 站点信息
   * </pre>
   *
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.StationType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.StationType)
      com.ctrip.flight.agg.shopping.contract.transportation.StationTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_StationType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_StationType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.StationType.class, com.ctrip.flight.agg.shopping.contract.transportation.StationType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.StationType.newBuilder()
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
      type_ = "";

      stationID_ = "";

      stationName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_StationType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.StationType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.StationType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.StationType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.StationType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.StationType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.StationType result = new com.ctrip.flight.agg.shopping.contract.transportation.StationType(this);
      result.type_ = type_;
      result.stationID_ = stationID_;
      result.stationName_ = stationName_;
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
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.StationType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.StationType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.StationType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.StationType.getDefaultInstance()) return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (!other.getStationID().isEmpty()) {
        stationID_ = other.stationID_;
        onChanged();
      }
      if (!other.getStationName().isEmpty()) {
        stationName_ = other.stationName_;
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
      com.ctrip.flight.agg.shopping.contract.transportation.StationType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.StationType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <pre>
     * 站点类型
     * </pre>
     *
     * <code>string Type = 1;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 站点类型
     * </pre>
     *
     * <code>string Type = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 站点类型
     * </pre>
     *
     * <code>string Type = 1;</code>
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 站点类型
     * </pre>
     *
     * <code>string Type = 1;</code>
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 站点类型
     * </pre>
     *
     * <code>string Type = 1;</code>
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object stationID_ = "";
    /**
     * <pre>
     * 站点id
     * </pre>
     *
     * <code>string StationID = 2;</code>
     */
    public java.lang.String getStationID() {
      java.lang.Object ref = stationID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stationID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 站点id
     * </pre>
     *
     * <code>string StationID = 2;</code>
     */
    public com.google.protobuf.ByteString
        getStationIDBytes() {
      java.lang.Object ref = stationID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stationID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 站点id
     * </pre>
     *
     * <code>string StationID = 2;</code>
     */
    public Builder setStationID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stationID_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 站点id
     * </pre>
     *
     * <code>string StationID = 2;</code>
     */
    public Builder clearStationID() {
      
      stationID_ = getDefaultInstance().getStationID();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 站点id
     * </pre>
     *
     * <code>string StationID = 2;</code>
     */
    public Builder setStationIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stationID_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object stationName_ = "";
    /**
     * <pre>
     * 站点名称
     * </pre>
     *
     * <code>string StationName = 3;</code>
     */
    public java.lang.String getStationName() {
      java.lang.Object ref = stationName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stationName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 站点名称
     * </pre>
     *
     * <code>string StationName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getStationNameBytes() {
      java.lang.Object ref = stationName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stationName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 站点名称
     * </pre>
     *
     * <code>string StationName = 3;</code>
     */
    public Builder setStationName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stationName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 站点名称
     * </pre>
     *
     * <code>string StationName = 3;</code>
     */
    public Builder clearStationName() {
      
      stationName_ = getDefaultInstance().getStationName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 站点名称
     * </pre>
     *
     * <code>string StationName = 3;</code>
     */
    public Builder setStationNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stationName_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.StationType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.StationType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.StationType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.StationType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.StationType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StationType>
      PARSER = new com.google.protobuf.AbstractParser<StationType>() {
    @java.lang.Override
    public StationType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StationType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StationType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StationType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.StationType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

