// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BookService.proto

package com.dkohut.bookchat.client.common.entity;

/**
 * <pre>
 * Enum which contain instances for ResponseMessage
 * </pre>
 *
 * Protobuf enum {@code com.dkohut.bookchat.client.common.entity.ResponseEnum}
 */
public enum ResponseEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SUCCESS = 0;</code>
   */
  SUCCESS(0),
  /**
   * <code>ERROR = 1;</code>
   */
  ERROR(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SUCCESS = 0;</code>
   */
  public static final int SUCCESS_VALUE = 0;
  /**
   * <code>ERROR = 1;</code>
   */
  public static final int ERROR_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ResponseEnum valueOf(int value) {
    return forNumber(value);
  }

  public static ResponseEnum forNumber(int value) {
    switch (value) {
      case 0: return SUCCESS;
      case 1: return ERROR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ResponseEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ResponseEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ResponseEnum>() {
          public ResponseEnum findValueByNumber(int number) {
            return ResponseEnum.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.dkohut.bookchat.client.common.entity.BookServiceOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final ResponseEnum[] VALUES = values();

  public static ResponseEnum valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ResponseEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.dkohut.bookchat.client.common.entity.ResponseEnum)
}

