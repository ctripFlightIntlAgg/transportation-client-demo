// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

/**
 * <pre>
 * 积分抵用现金实体类型
 * </pre>
 *
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType}
 */
public  final class CreditPointsType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType)
    CreditPointsTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreditPointsType.newBuilder() to construct.
  private CreditPointsType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreditPointsType() {
    refNum_ = 0;
    points_ = 0;
    cashAmount_ = 0D;
    activityID_ = 0L;
    pointsPayLaterInd_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreditPointsType(
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

            points_ = input.readInt32();
            break;
          }
          case 25: {

            cashAmount_ = input.readDouble();
            break;
          }
          case 32: {

            activityID_ = input.readInt64();
            break;
          }
          case 40: {

            pointsPayLaterInd_ = input.readBool();
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
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_CreditPointsType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_CreditPointsType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType.class, com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType.Builder.class);
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

  public static final int POINTS_FIELD_NUMBER = 2;
  private int points_;
  /**
   * <pre>
   * 预扣积分
   * </pre>
   *
   * <code>int32 Points = 2;</code>
   */
  public int getPoints() {
    return points_;
  }

  public static final int CASHAMOUNT_FIELD_NUMBER = 3;
  private double cashAmount_;
  /**
   * <pre>
   * 预抵现金
   * </pre>
   *
   * <code>double CashAmount = 3;</code>
   */
  public double getCashAmount() {
    return cashAmount_;
  }

  public static final int ACTIVITYID_FIELD_NUMBER = 4;
  private long activityID_;
  /**
   * <pre>
   * 活动ID
   * </pre>
   *
   * <code>int64 ActivityID = 4;</code>
   */
  public long getActivityID() {
    return activityID_;
  }

  public static final int POINTSPAYLATERIND_FIELD_NUMBER = 5;
  private boolean pointsPayLaterInd_;
  /**
   * <pre>
   * 是否是先享后付
   * </pre>
   *
   * <code>bool PointsPayLaterInd = 5;</code>
   */
  public boolean getPointsPayLaterInd() {
    return pointsPayLaterInd_;
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
    if (points_ != 0) {
      output.writeInt32(2, points_);
    }
    if (cashAmount_ != 0D) {
      output.writeDouble(3, cashAmount_);
    }
    if (activityID_ != 0L) {
      output.writeInt64(4, activityID_);
    }
    if (pointsPayLaterInd_ != false) {
      output.writeBool(5, pointsPayLaterInd_);
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
    if (points_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, points_);
    }
    if (cashAmount_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, cashAmount_);
    }
    if (activityID_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, activityID_);
    }
    if (pointsPayLaterInd_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, pointsPayLaterInd_);
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
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType other = (com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType) obj;

    boolean result = true;
    result = result && (getRefNum()
        == other.getRefNum());
    result = result && (getPoints()
        == other.getPoints());
    result = result && (
        java.lang.Double.doubleToLongBits(getCashAmount())
        == java.lang.Double.doubleToLongBits(
            other.getCashAmount()));
    result = result && (getActivityID()
        == other.getActivityID());
    result = result && (getPointsPayLaterInd()
        == other.getPointsPayLaterInd());
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
    hash = (37 * hash) + POINTS_FIELD_NUMBER;
    hash = (53 * hash) + getPoints();
    hash = (37 * hash) + CASHAMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getCashAmount()));
    hash = (37 * hash) + ACTIVITYID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getActivityID());
    hash = (37 * hash) + POINTSPAYLATERIND_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPointsPayLaterInd());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType prototype) {
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
   * 积分抵用现金实体类型
   * </pre>
   *
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType)
      com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_CreditPointsType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_CreditPointsType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType.class, com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType.newBuilder()
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

      points_ = 0;

      cashAmount_ = 0D;

      activityID_ = 0L;

      pointsPayLaterInd_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_CreditPointsType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType result = new com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType(this);
      result.refNum_ = refNum_;
      result.points_ = points_;
      result.cashAmount_ = cashAmount_;
      result.activityID_ = activityID_;
      result.pointsPayLaterInd_ = pointsPayLaterInd_;
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
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType.getDefaultInstance()) return this;
      if (other.getRefNum() != 0) {
        setRefNum(other.getRefNum());
      }
      if (other.getPoints() != 0) {
        setPoints(other.getPoints());
      }
      if (other.getCashAmount() != 0D) {
        setCashAmount(other.getCashAmount());
      }
      if (other.getActivityID() != 0L) {
        setActivityID(other.getActivityID());
      }
      if (other.getPointsPayLaterInd() != false) {
        setPointsPayLaterInd(other.getPointsPayLaterInd());
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
      com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType) e.getUnfinishedMessage();
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

    private int points_ ;
    /**
     * <pre>
     * 预扣积分
     * </pre>
     *
     * <code>int32 Points = 2;</code>
     */
    public int getPoints() {
      return points_;
    }
    /**
     * <pre>
     * 预扣积分
     * </pre>
     *
     * <code>int32 Points = 2;</code>
     */
    public Builder setPoints(int value) {
      
      points_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 预扣积分
     * </pre>
     *
     * <code>int32 Points = 2;</code>
     */
    public Builder clearPoints() {
      
      points_ = 0;
      onChanged();
      return this;
    }

    private double cashAmount_ ;
    /**
     * <pre>
     * 预抵现金
     * </pre>
     *
     * <code>double CashAmount = 3;</code>
     */
    public double getCashAmount() {
      return cashAmount_;
    }
    /**
     * <pre>
     * 预抵现金
     * </pre>
     *
     * <code>double CashAmount = 3;</code>
     */
    public Builder setCashAmount(double value) {
      
      cashAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 预抵现金
     * </pre>
     *
     * <code>double CashAmount = 3;</code>
     */
    public Builder clearCashAmount() {
      
      cashAmount_ = 0D;
      onChanged();
      return this;
    }

    private long activityID_ ;
    /**
     * <pre>
     * 活动ID
     * </pre>
     *
     * <code>int64 ActivityID = 4;</code>
     */
    public long getActivityID() {
      return activityID_;
    }
    /**
     * <pre>
     * 活动ID
     * </pre>
     *
     * <code>int64 ActivityID = 4;</code>
     */
    public Builder setActivityID(long value) {
      
      activityID_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 活动ID
     * </pre>
     *
     * <code>int64 ActivityID = 4;</code>
     */
    public Builder clearActivityID() {
      
      activityID_ = 0L;
      onChanged();
      return this;
    }

    private boolean pointsPayLaterInd_ ;
    /**
     * <pre>
     * 是否是先享后付
     * </pre>
     *
     * <code>bool PointsPayLaterInd = 5;</code>
     */
    public boolean getPointsPayLaterInd() {
      return pointsPayLaterInd_;
    }
    /**
     * <pre>
     * 是否是先享后付
     * </pre>
     *
     * <code>bool PointsPayLaterInd = 5;</code>
     */
    public Builder setPointsPayLaterInd(boolean value) {
      
      pointsPayLaterInd_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否是先享后付
     * </pre>
     *
     * <code>bool PointsPayLaterInd = 5;</code>
     */
    public Builder clearPointsPayLaterInd() {
      
      pointsPayLaterInd_ = false;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreditPointsType>
      PARSER = new com.google.protobuf.AbstractParser<CreditPointsType>() {
    @java.lang.Override
    public CreditPointsType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreditPointsType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreditPointsType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreditPointsType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

