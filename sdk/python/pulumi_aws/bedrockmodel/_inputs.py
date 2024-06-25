# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = [
    'InvocationLoggingConfigurationLoggingConfigArgs',
    'InvocationLoggingConfigurationLoggingConfigArgsDict',
    'InvocationLoggingConfigurationLoggingConfigCloudwatchConfigArgs',
    'InvocationLoggingConfigurationLoggingConfigCloudwatchConfigArgsDict',
    'InvocationLoggingConfigurationLoggingConfigCloudwatchConfigLargeDataDeliveryS3ConfigArgs',
    'InvocationLoggingConfigurationLoggingConfigCloudwatchConfigLargeDataDeliveryS3ConfigArgsDict',
    'InvocationLoggingConfigurationLoggingConfigS3ConfigArgs',
    'InvocationLoggingConfigurationLoggingConfigS3ConfigArgsDict',
]

MYPY = False

if not MYPY:
    class InvocationLoggingConfigurationLoggingConfigArgsDict(TypedDict):
        embedding_data_delivery_enabled: pulumi.Input[bool]
        """
        Set to include embeddings data in the log delivery.
        """
        image_data_delivery_enabled: pulumi.Input[bool]
        """
        Set to include image data in the log delivery.
        """
        text_data_delivery_enabled: pulumi.Input[bool]
        """
        Set to include text data in the log delivery.
        """
        cloudwatch_config: NotRequired[pulumi.Input['InvocationLoggingConfigurationLoggingConfigCloudwatchConfigArgsDict']]
        """
        CloudWatch logging configuration.
        """
        s3_config: NotRequired[pulumi.Input['InvocationLoggingConfigurationLoggingConfigS3ConfigArgsDict']]
        """
        S3 configuration for storing log data.
        """
elif False:
    InvocationLoggingConfigurationLoggingConfigArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class InvocationLoggingConfigurationLoggingConfigArgs:
    def __init__(__self__, *,
                 embedding_data_delivery_enabled: pulumi.Input[bool],
                 image_data_delivery_enabled: pulumi.Input[bool],
                 text_data_delivery_enabled: pulumi.Input[bool],
                 cloudwatch_config: Optional[pulumi.Input['InvocationLoggingConfigurationLoggingConfigCloudwatchConfigArgs']] = None,
                 s3_config: Optional[pulumi.Input['InvocationLoggingConfigurationLoggingConfigS3ConfigArgs']] = None):
        """
        :param pulumi.Input[bool] embedding_data_delivery_enabled: Set to include embeddings data in the log delivery.
        :param pulumi.Input[bool] image_data_delivery_enabled: Set to include image data in the log delivery.
        :param pulumi.Input[bool] text_data_delivery_enabled: Set to include text data in the log delivery.
        :param pulumi.Input['InvocationLoggingConfigurationLoggingConfigCloudwatchConfigArgs'] cloudwatch_config: CloudWatch logging configuration.
        :param pulumi.Input['InvocationLoggingConfigurationLoggingConfigS3ConfigArgs'] s3_config: S3 configuration for storing log data.
        """
        pulumi.set(__self__, "embedding_data_delivery_enabled", embedding_data_delivery_enabled)
        pulumi.set(__self__, "image_data_delivery_enabled", image_data_delivery_enabled)
        pulumi.set(__self__, "text_data_delivery_enabled", text_data_delivery_enabled)
        if cloudwatch_config is not None:
            pulumi.set(__self__, "cloudwatch_config", cloudwatch_config)
        if s3_config is not None:
            pulumi.set(__self__, "s3_config", s3_config)

    @property
    @pulumi.getter(name="embeddingDataDeliveryEnabled")
    def embedding_data_delivery_enabled(self) -> pulumi.Input[bool]:
        """
        Set to include embeddings data in the log delivery.
        """
        return pulumi.get(self, "embedding_data_delivery_enabled")

    @embedding_data_delivery_enabled.setter
    def embedding_data_delivery_enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "embedding_data_delivery_enabled", value)

    @property
    @pulumi.getter(name="imageDataDeliveryEnabled")
    def image_data_delivery_enabled(self) -> pulumi.Input[bool]:
        """
        Set to include image data in the log delivery.
        """
        return pulumi.get(self, "image_data_delivery_enabled")

    @image_data_delivery_enabled.setter
    def image_data_delivery_enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "image_data_delivery_enabled", value)

    @property
    @pulumi.getter(name="textDataDeliveryEnabled")
    def text_data_delivery_enabled(self) -> pulumi.Input[bool]:
        """
        Set to include text data in the log delivery.
        """
        return pulumi.get(self, "text_data_delivery_enabled")

    @text_data_delivery_enabled.setter
    def text_data_delivery_enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "text_data_delivery_enabled", value)

    @property
    @pulumi.getter(name="cloudwatchConfig")
    def cloudwatch_config(self) -> Optional[pulumi.Input['InvocationLoggingConfigurationLoggingConfigCloudwatchConfigArgs']]:
        """
        CloudWatch logging configuration.
        """
        return pulumi.get(self, "cloudwatch_config")

    @cloudwatch_config.setter
    def cloudwatch_config(self, value: Optional[pulumi.Input['InvocationLoggingConfigurationLoggingConfigCloudwatchConfigArgs']]):
        pulumi.set(self, "cloudwatch_config", value)

    @property
    @pulumi.getter(name="s3Config")
    def s3_config(self) -> Optional[pulumi.Input['InvocationLoggingConfigurationLoggingConfigS3ConfigArgs']]:
        """
        S3 configuration for storing log data.
        """
        return pulumi.get(self, "s3_config")

    @s3_config.setter
    def s3_config(self, value: Optional[pulumi.Input['InvocationLoggingConfigurationLoggingConfigS3ConfigArgs']]):
        pulumi.set(self, "s3_config", value)


if not MYPY:
    class InvocationLoggingConfigurationLoggingConfigCloudwatchConfigArgsDict(TypedDict):
        large_data_delivery_s3_config: NotRequired[pulumi.Input['InvocationLoggingConfigurationLoggingConfigCloudwatchConfigLargeDataDeliveryS3ConfigArgsDict']]
        """
        S3 configuration for delivering a large amount of data.
        """
        log_group_name: NotRequired[pulumi.Input[str]]
        """
        Log group name.
        """
        role_arn: NotRequired[pulumi.Input[str]]
        """
        The role ARN.
        """
elif False:
    InvocationLoggingConfigurationLoggingConfigCloudwatchConfigArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class InvocationLoggingConfigurationLoggingConfigCloudwatchConfigArgs:
    def __init__(__self__, *,
                 large_data_delivery_s3_config: Optional[pulumi.Input['InvocationLoggingConfigurationLoggingConfigCloudwatchConfigLargeDataDeliveryS3ConfigArgs']] = None,
                 log_group_name: Optional[pulumi.Input[str]] = None,
                 role_arn: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input['InvocationLoggingConfigurationLoggingConfigCloudwatchConfigLargeDataDeliveryS3ConfigArgs'] large_data_delivery_s3_config: S3 configuration for delivering a large amount of data.
        :param pulumi.Input[str] log_group_name: Log group name.
        :param pulumi.Input[str] role_arn: The role ARN.
        """
        if large_data_delivery_s3_config is not None:
            pulumi.set(__self__, "large_data_delivery_s3_config", large_data_delivery_s3_config)
        if log_group_name is not None:
            pulumi.set(__self__, "log_group_name", log_group_name)
        if role_arn is not None:
            pulumi.set(__self__, "role_arn", role_arn)

    @property
    @pulumi.getter(name="largeDataDeliveryS3Config")
    def large_data_delivery_s3_config(self) -> Optional[pulumi.Input['InvocationLoggingConfigurationLoggingConfigCloudwatchConfigLargeDataDeliveryS3ConfigArgs']]:
        """
        S3 configuration for delivering a large amount of data.
        """
        return pulumi.get(self, "large_data_delivery_s3_config")

    @large_data_delivery_s3_config.setter
    def large_data_delivery_s3_config(self, value: Optional[pulumi.Input['InvocationLoggingConfigurationLoggingConfigCloudwatchConfigLargeDataDeliveryS3ConfigArgs']]):
        pulumi.set(self, "large_data_delivery_s3_config", value)

    @property
    @pulumi.getter(name="logGroupName")
    def log_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        Log group name.
        """
        return pulumi.get(self, "log_group_name")

    @log_group_name.setter
    def log_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "log_group_name", value)

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The role ARN.
        """
        return pulumi.get(self, "role_arn")

    @role_arn.setter
    def role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_arn", value)


if not MYPY:
    class InvocationLoggingConfigurationLoggingConfigCloudwatchConfigLargeDataDeliveryS3ConfigArgsDict(TypedDict):
        bucket_name: NotRequired[pulumi.Input[str]]
        """
        S3 bucket name.
        """
        key_prefix: NotRequired[pulumi.Input[str]]
        """
        S3 prefix.
        """
elif False:
    InvocationLoggingConfigurationLoggingConfigCloudwatchConfigLargeDataDeliveryS3ConfigArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class InvocationLoggingConfigurationLoggingConfigCloudwatchConfigLargeDataDeliveryS3ConfigArgs:
    def __init__(__self__, *,
                 bucket_name: Optional[pulumi.Input[str]] = None,
                 key_prefix: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] bucket_name: S3 bucket name.
        :param pulumi.Input[str] key_prefix: S3 prefix.
        """
        if bucket_name is not None:
            pulumi.set(__self__, "bucket_name", bucket_name)
        if key_prefix is not None:
            pulumi.set(__self__, "key_prefix", key_prefix)

    @property
    @pulumi.getter(name="bucketName")
    def bucket_name(self) -> Optional[pulumi.Input[str]]:
        """
        S3 bucket name.
        """
        return pulumi.get(self, "bucket_name")

    @bucket_name.setter
    def bucket_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bucket_name", value)

    @property
    @pulumi.getter(name="keyPrefix")
    def key_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        S3 prefix.
        """
        return pulumi.get(self, "key_prefix")

    @key_prefix.setter
    def key_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key_prefix", value)


if not MYPY:
    class InvocationLoggingConfigurationLoggingConfigS3ConfigArgsDict(TypedDict):
        bucket_name: NotRequired[pulumi.Input[str]]
        """
        S3 bucket name.
        """
        key_prefix: NotRequired[pulumi.Input[str]]
        """
        S3 prefix.
        """
elif False:
    InvocationLoggingConfigurationLoggingConfigS3ConfigArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class InvocationLoggingConfigurationLoggingConfigS3ConfigArgs:
    def __init__(__self__, *,
                 bucket_name: Optional[pulumi.Input[str]] = None,
                 key_prefix: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] bucket_name: S3 bucket name.
        :param pulumi.Input[str] key_prefix: S3 prefix.
        """
        if bucket_name is not None:
            pulumi.set(__self__, "bucket_name", bucket_name)
        if key_prefix is not None:
            pulumi.set(__self__, "key_prefix", key_prefix)

    @property
    @pulumi.getter(name="bucketName")
    def bucket_name(self) -> Optional[pulumi.Input[str]]:
        """
        S3 bucket name.
        """
        return pulumi.get(self, "bucket_name")

    @bucket_name.setter
    def bucket_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bucket_name", value)

    @property
    @pulumi.getter(name="keyPrefix")
    def key_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        S3 prefix.
        """
        return pulumi.get(self, "key_prefix")

    @key_prefix.setter
    def key_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key_prefix", value)


