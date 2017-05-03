// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SubscribeResp.proto

package com.lol.demo.encode.protobuf;

public final class SubscribeRespProto {
  private SubscribeRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SubscribeRespOrBuilder extends
      // @@protoc_insertion_point(interface_extends:netty.SubscribeResp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 subReqID = 1;</code>
     */
    int getSubReqID();

    /**
     * <code>optional string respCode = 2;</code>
     */
    String getRespCode();
    /**
     * <code>optional string respCode = 2;</code>
     */
    com.google.protobuf.ByteString
        getRespCodeBytes();

    /**
     * <code>optional string desc = 3;</code>
     */
    String getDesc();
    /**
     * <code>optional string desc = 3;</code>
     */
    com.google.protobuf.ByteString
        getDescBytes();

    /**
     * <code>optional .netty.SubscribeResp.MsgType msgType = 4;</code>
     */
    int getMsgTypeValue();
    /**
     * <code>optional .netty.SubscribeResp.MsgType msgType = 4;</code>
     */
    SubscribeResp.MsgType getMsgType();
  }
  /**
   * Protobuf type {@code netty.SubscribeResp}
   */
  public  static final class SubscribeResp extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:netty.SubscribeResp)
      SubscribeRespOrBuilder {
    // Use SubscribeResp.newBuilder() to construct.
    private SubscribeResp(com.google.protobuf.GeneratedMessage.Builder builder) {
      super(builder);
    }
    private SubscribeResp() {
      subReqID_ = 0;
      respCode_ = "";
      desc_ = "";
      msgType_ = 0;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private SubscribeResp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              subReqID_ = input.readInt32();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();

              respCode_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();

              desc_ = bs;
              break;
            }
            case 32: {
              int rawValue = input.readEnum();

              msgType_ = rawValue;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SubscribeRespProto.internal_static_netty_SubscribeResp_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SubscribeRespProto.internal_static_netty_SubscribeResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SubscribeResp.class, Builder.class);
    }

    /**
     * Protobuf enum {@code netty.SubscribeResp.MsgType}
     */
    public enum MsgType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>DEFAULT = 0;</code>
       */
      DEFAULT(0, 0),
      /**
       * <code>LOGIN_REQ = 1;</code>
       */
      LOGIN_REQ(1, 1),
      /**
       * <code>LOGIN_RESP = 2;</code>
       */
      LOGIN_RESP(2, 2),
      /**
       * <code>LOGIN_OK = 3;</code>
       */
      LOGIN_OK(3, 3),
      /**
       * <code>LOGIN_OUT_OF_WHITE_IP = 4;</code>
       */
      LOGIN_OUT_OF_WHITE_IP(4, 4),
      /**
       * <code>LOGIN_DENY = 5;</code>
       */
      LOGIN_DENY(5, 5),
      /**
       * <code>HEARTBEAT_REQ = 6;</code>
       */
      HEARTBEAT_REQ(6, 6),
      /**
       * <code>HEARTBEAT_RESP = 7;</code>
       */
      HEARTBEAT_RESP(7, 7),
      /**
       * <code>GAME_REQ = 8;</code>
       */
      GAME_REQ(8, 8),
      /**
       * <code>GAME_RESP = 9;</code>
       */
      GAME_RESP(9, 9),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DEFAULT = 0;</code>
       */
      public static final int DEFAULT_VALUE = 0;
      /**
       * <code>LOGIN_REQ = 1;</code>
       */
      public static final int LOGIN_REQ_VALUE = 1;
      /**
       * <code>LOGIN_RESP = 2;</code>
       */
      public static final int LOGIN_RESP_VALUE = 2;
      /**
       * <code>LOGIN_OK = 3;</code>
       */
      public static final int LOGIN_OK_VALUE = 3;
      /**
       * <code>LOGIN_OUT_OF_WHITE_IP = 4;</code>
       */
      public static final int LOGIN_OUT_OF_WHITE_IP_VALUE = 4;
      /**
       * <code>LOGIN_DENY = 5;</code>
       */
      public static final int LOGIN_DENY_VALUE = 5;
      /**
       * <code>HEARTBEAT_REQ = 6;</code>
       */
      public static final int HEARTBEAT_REQ_VALUE = 6;
      /**
       * <code>HEARTBEAT_RESP = 7;</code>
       */
      public static final int HEARTBEAT_RESP_VALUE = 7;
      /**
       * <code>GAME_REQ = 8;</code>
       */
      public static final int GAME_REQ_VALUE = 8;
      /**
       * <code>GAME_RESP = 9;</code>
       */
      public static final int GAME_RESP_VALUE = 9;


      public final int getNumber() {
        if (index == -1) {
          throw new IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      public static MsgType valueOf(int value) {
        switch (value) {
          case 0: return DEFAULT;
          case 1: return LOGIN_REQ;
          case 2: return LOGIN_RESP;
          case 3: return LOGIN_OK;
          case 4: return LOGIN_OUT_OF_WHITE_IP;
          case 5: return LOGIN_DENY;
          case 6: return HEARTBEAT_REQ;
          case 7: return HEARTBEAT_RESP;
          case 8: return GAME_REQ;
          case 9: return GAME_RESP;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<MsgType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<MsgType>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<MsgType>() {
              public MsgType findValueByNumber(int number) {
                return MsgType.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return SubscribeResp.getDescriptor().getEnumTypes().get(0);
      }

      private static final MsgType[] VALUES = values();

      public static MsgType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private MsgType(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:netty.SubscribeResp.MsgType)
    }

    public static final int SUBREQID_FIELD_NUMBER = 1;
    private int subReqID_;
    /**
     * <code>optional int32 subReqID = 1;</code>
     */
    public int getSubReqID() {
      return subReqID_;
    }

    public static final int RESPCODE_FIELD_NUMBER = 2;
    private volatile Object respCode_;
    /**
     * <code>optional string respCode = 2;</code>
     */
    public String getRespCode() {
      Object ref = respCode_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          respCode_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string respCode = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRespCodeBytes() {
      Object ref = respCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        respCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DESC_FIELD_NUMBER = 3;
    private volatile Object desc_;
    /**
     * <code>optional string desc = 3;</code>
     */
    public String getDesc() {
      Object ref = desc_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          desc_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string desc = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDescBytes() {
      Object ref = desc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        desc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MSGTYPE_FIELD_NUMBER = 4;
    private int msgType_;
    /**
     * <code>optional .netty.SubscribeResp.MsgType msgType = 4;</code>
     */
    public int getMsgTypeValue() {
      return msgType_;
    }
    /**
     * <code>optional .netty.SubscribeResp.MsgType msgType = 4;</code>
     */
    public MsgType getMsgType() {
      MsgType result = MsgType.valueOf(msgType_);
      return result == null ? MsgType.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (subReqID_ != 0) {
        output.writeInt32(1, subReqID_);
      }
      if (!getRespCodeBytes().isEmpty()) {
        output.writeBytes(2, getRespCodeBytes());
      }
      if (!getDescBytes().isEmpty()) {
        output.writeBytes(3, getDescBytes());
      }
      if (msgType_ != MsgType.DEFAULT.getNumber()) {
        output.writeEnum(4, msgType_);
      }
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (subReqID_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, subReqID_);
      }
      if (!getRespCodeBytes().isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getRespCodeBytes());
      }
      if (!getDescBytes().isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getDescBytes());
      }
      if (msgType_ != MsgType.DEFAULT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, msgType_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static SubscribeResp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SubscribeResp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SubscribeResp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SubscribeResp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SubscribeResp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static SubscribeResp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static SubscribeResp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static SubscribeResp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static SubscribeResp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static SubscribeResp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(SubscribeResp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code netty.SubscribeResp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:netty.SubscribeResp)
        SubscribeRespOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SubscribeRespProto.internal_static_netty_SubscribeResp_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SubscribeRespProto.internal_static_netty_SubscribeResp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SubscribeResp.class, Builder.class);
      }

      // Construct using com.lol.demo.encode.protobuf.SubscribeRespProto.SubscribeResp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        subReqID_ = 0;

        respCode_ = "";

        desc_ = "";

        msgType_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SubscribeRespProto.internal_static_netty_SubscribeResp_descriptor;
      }

      public SubscribeResp getDefaultInstanceForType() {
        return SubscribeResp.getDefaultInstance();
      }

      public SubscribeResp build() {
        SubscribeResp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SubscribeResp buildPartial() {
        SubscribeResp result = new SubscribeResp(this);
        result.subReqID_ = subReqID_;
        result.respCode_ = respCode_;
        result.desc_ = desc_;
        result.msgType_ = msgType_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SubscribeResp) {
          return mergeFrom((SubscribeResp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SubscribeResp other) {
        if (other == SubscribeResp.getDefaultInstance()) return this;
        if (other.getSubReqID() != 0) {
          setSubReqID(other.getSubReqID());
        }
        if (!other.getRespCode().isEmpty()) {
          respCode_ = other.respCode_;
          onChanged();
        }
        if (!other.getDesc().isEmpty()) {
          desc_ = other.desc_;
          onChanged();
        }
        if (other.msgType_ != 0) {
          setMsgTypeValue(other.getMsgTypeValue());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        SubscribeResp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SubscribeResp) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int subReqID_ ;
      /**
       * <code>optional int32 subReqID = 1;</code>
       */
      public int getSubReqID() {
        return subReqID_;
      }
      /**
       * <code>optional int32 subReqID = 1;</code>
       */
      public Builder setSubReqID(int value) {
        
        subReqID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 subReqID = 1;</code>
       */
      public Builder clearSubReqID() {
        
        subReqID_ = 0;
        onChanged();
        return this;
      }

      private Object respCode_ = "";
      /**
       * <code>optional string respCode = 2;</code>
       */
      public String getRespCode() {
        Object ref = respCode_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            respCode_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string respCode = 2;</code>
       */
      public com.google.protobuf.ByteString
          getRespCodeBytes() {
        Object ref = respCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          respCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string respCode = 2;</code>
       */
      public Builder setRespCode(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        respCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string respCode = 2;</code>
       */
      public Builder clearRespCode() {
        
        respCode_ = getDefaultInstance().getRespCode();
        onChanged();
        return this;
      }
      /**
       * <code>optional string respCode = 2;</code>
       */
      public Builder setRespCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        respCode_ = value;
        onChanged();
        return this;
      }

      private Object desc_ = "";
      /**
       * <code>optional string desc = 3;</code>
       */
      public String getDesc() {
        Object ref = desc_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            desc_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string desc = 3;</code>
       */
      public com.google.protobuf.ByteString
          getDescBytes() {
        Object ref = desc_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          desc_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string desc = 3;</code>
       */
      public Builder setDesc(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        desc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string desc = 3;</code>
       */
      public Builder clearDesc() {
        
        desc_ = getDefaultInstance().getDesc();
        onChanged();
        return this;
      }
      /**
       * <code>optional string desc = 3;</code>
       */
      public Builder setDescBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        desc_ = value;
        onChanged();
        return this;
      }

      private int msgType_ = 0;
      /**
       * <code>optional .netty.SubscribeResp.MsgType msgType = 4;</code>
       */
      public int getMsgTypeValue() {
        return msgType_;
      }
      /**
       * <code>optional .netty.SubscribeResp.MsgType msgType = 4;</code>
       */
      public Builder setMsgTypeValue(int value) {
        msgType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .netty.SubscribeResp.MsgType msgType = 4;</code>
       */
      public MsgType getMsgType() {
        MsgType result = MsgType.valueOf(msgType_);
        return result == null ? MsgType.UNRECOGNIZED : result;
      }
      /**
       * <code>optional .netty.SubscribeResp.MsgType msgType = 4;</code>
       */
      public Builder setMsgType(MsgType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        msgType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .netty.SubscribeResp.MsgType msgType = 4;</code>
       */
      public Builder clearMsgType() {
        
        msgType_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:netty.SubscribeResp)
    }

    // @@protoc_insertion_point(class_scope:netty.SubscribeResp)
    private static final SubscribeResp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SubscribeResp();
    }

    public static SubscribeResp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.Parser<SubscribeResp> PARSER =
        new com.google.protobuf.AbstractParser<SubscribeResp>() {
      public SubscribeResp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new SubscribeResp(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    @Override
    public com.google.protobuf.Parser<SubscribeResp> getParserForType() {
      return PARSER;
    }

    public SubscribeResp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_netty_SubscribeResp_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_netty_SubscribeResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\023SubscribeResp.proto\022\005netty\"\245\002\n\rSubscri" +
      "beResp\022\020\n\010subReqID\030\001 \001(\005\022\020\n\010respCode\030\002 \001" +
      "(\t\022\014\n\004desc\030\003 \001(\t\022-\n\007msgType\030\004 \001(\0162\034.nett" +
      "y.SubscribeResp.MsgType\"\262\001\n\007MsgType\022\013\n\007D" +
      "EFAULT\020\000\022\r\n\tLOGIN_REQ\020\001\022\016\n\nLOGIN_RESP\020\002\022" +
      "\014\n\010LOGIN_OK\020\003\022\031\n\025LOGIN_OUT_OF_WHITE_IP\020\004" +
      "\022\016\n\nLOGIN_DENY\020\005\022\021\n\rHEARTBEAT_REQ\020\006\022\022\n\016H" +
      "EARTBEAT_RESP\020\007\022\014\n\010GAME_REQ\020\010\022\r\n\tGAME_RE" +
      "SP\020\tB2\n\034com.lol.demo.encode.protobufB\022Su" +
      "bscribeRespProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_netty_SubscribeResp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_netty_SubscribeResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_netty_SubscribeResp_descriptor,
        new String[] { "SubReqID", "RespCode", "Desc", "MsgType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
