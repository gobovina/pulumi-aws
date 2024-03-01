# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['InstanceLoggingConfigurationArgs', 'InstanceLoggingConfiguration']

@pulumi.input_type
class InstanceLoggingConfigurationArgs:
    def __init__(__self__, *,
                 access_logs: pulumi.Input['InstanceLoggingConfigurationAccessLogsArgs'],
                 verifiedaccess_instance_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a InstanceLoggingConfiguration resource.
        :param pulumi.Input['InstanceLoggingConfigurationAccessLogsArgs'] access_logs: A block that specifies the configuration options for Verified Access instances. Detailed below.
        :param pulumi.Input[str] verifiedaccess_instance_id: The ID of the Verified Access instance.
        """
        pulumi.set(__self__, "access_logs", access_logs)
        pulumi.set(__self__, "verifiedaccess_instance_id", verifiedaccess_instance_id)

    @property
    @pulumi.getter(name="accessLogs")
    def access_logs(self) -> pulumi.Input['InstanceLoggingConfigurationAccessLogsArgs']:
        """
        A block that specifies the configuration options for Verified Access instances. Detailed below.
        """
        return pulumi.get(self, "access_logs")

    @access_logs.setter
    def access_logs(self, value: pulumi.Input['InstanceLoggingConfigurationAccessLogsArgs']):
        pulumi.set(self, "access_logs", value)

    @property
    @pulumi.getter(name="verifiedaccessInstanceId")
    def verifiedaccess_instance_id(self) -> pulumi.Input[str]:
        """
        The ID of the Verified Access instance.
        """
        return pulumi.get(self, "verifiedaccess_instance_id")

    @verifiedaccess_instance_id.setter
    def verifiedaccess_instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "verifiedaccess_instance_id", value)


@pulumi.input_type
class _InstanceLoggingConfigurationState:
    def __init__(__self__, *,
                 access_logs: Optional[pulumi.Input['InstanceLoggingConfigurationAccessLogsArgs']] = None,
                 verifiedaccess_instance_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering InstanceLoggingConfiguration resources.
        :param pulumi.Input['InstanceLoggingConfigurationAccessLogsArgs'] access_logs: A block that specifies the configuration options for Verified Access instances. Detailed below.
        :param pulumi.Input[str] verifiedaccess_instance_id: The ID of the Verified Access instance.
        """
        if access_logs is not None:
            pulumi.set(__self__, "access_logs", access_logs)
        if verifiedaccess_instance_id is not None:
            pulumi.set(__self__, "verifiedaccess_instance_id", verifiedaccess_instance_id)

    @property
    @pulumi.getter(name="accessLogs")
    def access_logs(self) -> Optional[pulumi.Input['InstanceLoggingConfigurationAccessLogsArgs']]:
        """
        A block that specifies the configuration options for Verified Access instances. Detailed below.
        """
        return pulumi.get(self, "access_logs")

    @access_logs.setter
    def access_logs(self, value: Optional[pulumi.Input['InstanceLoggingConfigurationAccessLogsArgs']]):
        pulumi.set(self, "access_logs", value)

    @property
    @pulumi.getter(name="verifiedaccessInstanceId")
    def verifiedaccess_instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Verified Access instance.
        """
        return pulumi.get(self, "verifiedaccess_instance_id")

    @verifiedaccess_instance_id.setter
    def verifiedaccess_instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "verifiedaccess_instance_id", value)


class InstanceLoggingConfiguration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_logs: Optional[pulumi.Input[pulumi.InputType['InstanceLoggingConfigurationAccessLogsArgs']]] = None,
                 verifiedaccess_instance_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for managing a Verified Access Logging Configuration.

        ## Example Usage
        ### With CloudWatch Logging

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.verifiedaccess.InstanceLoggingConfiguration("example",
            access_logs=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsArgs(
                cloudwatch_logs=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsCloudwatchLogsArgs(
                    enabled=True,
                    log_group=example_aws_cloudwatch_log_group["id"],
                ),
            ),
            verifiedaccess_instance_id=example_aws_verifiedaccess_instance["id"])
        ```
        ### With Kinesis Data Firehose Logging

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.verifiedaccess.InstanceLoggingConfiguration("example",
            access_logs=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsArgs(
                kinesis_data_firehose=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsKinesisDataFirehoseArgs(
                    delivery_stream=example_aws_kinesis_firehose_delivery_stream["name"],
                    enabled=True,
                ),
            ),
            verifiedaccess_instance_id=example_aws_verifiedaccess_instance["id"])
        ```
        ### With S3 logging

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.verifiedaccess.InstanceLoggingConfiguration("example",
            access_logs=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsArgs(
                s3=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsS3Args(
                    bucket_name=example_aws_s3_bucket["id"],
                    enabled=True,
                    prefix="example",
                ),
            ),
            verifiedaccess_instance_id=example_aws_verifiedaccess_instance["id"])
        ```
        ### With all three logging options

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.verifiedaccess.InstanceLoggingConfiguration("example",
            access_logs=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsArgs(
                cloudwatch_logs=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsCloudwatchLogsArgs(
                    enabled=True,
                    log_group=example_aws_cloudwatch_log_group["id"],
                ),
                kinesis_data_firehose=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsKinesisDataFirehoseArgs(
                    delivery_stream=example_aws_kinesis_firehose_delivery_stream["name"],
                    enabled=True,
                ),
                s3=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsS3Args(
                    bucket_name=example_aws_s3_bucket["id"],
                    enabled=True,
                ),
            ),
            verifiedaccess_instance_id=example_aws_verifiedaccess_instance["id"])
        ```
        ### With `include_trust_context`

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.verifiedaccess.InstanceLoggingConfiguration("example",
            access_logs=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsArgs(
                include_trust_context=True,
            ),
            verifiedaccess_instance_id=example_aws_verifiedaccess_instance["id"])
        ```
        ### With `log_version`

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.verifiedaccess.InstanceLoggingConfiguration("example",
            access_logs=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsArgs(
                log_version="ocsf-1.0.0-rc.2",
            ),
            verifiedaccess_instance_id=example_aws_verifiedaccess_instance["id"])
        ```

        ## Import

        Using `pulumi import`, import Verified Access Logging Configuration using the Verified Access Instance `id`. For example:

        ```sh
         $ pulumi import aws:verifiedaccess/instanceLoggingConfiguration:InstanceLoggingConfiguration example vai-1234567890abcdef0
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['InstanceLoggingConfigurationAccessLogsArgs']] access_logs: A block that specifies the configuration options for Verified Access instances. Detailed below.
        :param pulumi.Input[str] verifiedaccess_instance_id: The ID of the Verified Access instance.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: InstanceLoggingConfigurationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing a Verified Access Logging Configuration.

        ## Example Usage
        ### With CloudWatch Logging

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.verifiedaccess.InstanceLoggingConfiguration("example",
            access_logs=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsArgs(
                cloudwatch_logs=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsCloudwatchLogsArgs(
                    enabled=True,
                    log_group=example_aws_cloudwatch_log_group["id"],
                ),
            ),
            verifiedaccess_instance_id=example_aws_verifiedaccess_instance["id"])
        ```
        ### With Kinesis Data Firehose Logging

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.verifiedaccess.InstanceLoggingConfiguration("example",
            access_logs=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsArgs(
                kinesis_data_firehose=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsKinesisDataFirehoseArgs(
                    delivery_stream=example_aws_kinesis_firehose_delivery_stream["name"],
                    enabled=True,
                ),
            ),
            verifiedaccess_instance_id=example_aws_verifiedaccess_instance["id"])
        ```
        ### With S3 logging

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.verifiedaccess.InstanceLoggingConfiguration("example",
            access_logs=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsArgs(
                s3=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsS3Args(
                    bucket_name=example_aws_s3_bucket["id"],
                    enabled=True,
                    prefix="example",
                ),
            ),
            verifiedaccess_instance_id=example_aws_verifiedaccess_instance["id"])
        ```
        ### With all three logging options

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.verifiedaccess.InstanceLoggingConfiguration("example",
            access_logs=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsArgs(
                cloudwatch_logs=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsCloudwatchLogsArgs(
                    enabled=True,
                    log_group=example_aws_cloudwatch_log_group["id"],
                ),
                kinesis_data_firehose=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsKinesisDataFirehoseArgs(
                    delivery_stream=example_aws_kinesis_firehose_delivery_stream["name"],
                    enabled=True,
                ),
                s3=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsS3Args(
                    bucket_name=example_aws_s3_bucket["id"],
                    enabled=True,
                ),
            ),
            verifiedaccess_instance_id=example_aws_verifiedaccess_instance["id"])
        ```
        ### With `include_trust_context`

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.verifiedaccess.InstanceLoggingConfiguration("example",
            access_logs=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsArgs(
                include_trust_context=True,
            ),
            verifiedaccess_instance_id=example_aws_verifiedaccess_instance["id"])
        ```
        ### With `log_version`

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.verifiedaccess.InstanceLoggingConfiguration("example",
            access_logs=aws.verifiedaccess.InstanceLoggingConfigurationAccessLogsArgs(
                log_version="ocsf-1.0.0-rc.2",
            ),
            verifiedaccess_instance_id=example_aws_verifiedaccess_instance["id"])
        ```

        ## Import

        Using `pulumi import`, import Verified Access Logging Configuration using the Verified Access Instance `id`. For example:

        ```sh
         $ pulumi import aws:verifiedaccess/instanceLoggingConfiguration:InstanceLoggingConfiguration example vai-1234567890abcdef0
        ```

        :param str resource_name: The name of the resource.
        :param InstanceLoggingConfigurationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(InstanceLoggingConfigurationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_logs: Optional[pulumi.Input[pulumi.InputType['InstanceLoggingConfigurationAccessLogsArgs']]] = None,
                 verifiedaccess_instance_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InstanceLoggingConfigurationArgs.__new__(InstanceLoggingConfigurationArgs)

            if access_logs is None and not opts.urn:
                raise TypeError("Missing required property 'access_logs'")
            __props__.__dict__["access_logs"] = access_logs
            if verifiedaccess_instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'verifiedaccess_instance_id'")
            __props__.__dict__["verifiedaccess_instance_id"] = verifiedaccess_instance_id
        super(InstanceLoggingConfiguration, __self__).__init__(
            'aws:verifiedaccess/instanceLoggingConfiguration:InstanceLoggingConfiguration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_logs: Optional[pulumi.Input[pulumi.InputType['InstanceLoggingConfigurationAccessLogsArgs']]] = None,
            verifiedaccess_instance_id: Optional[pulumi.Input[str]] = None) -> 'InstanceLoggingConfiguration':
        """
        Get an existing InstanceLoggingConfiguration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['InstanceLoggingConfigurationAccessLogsArgs']] access_logs: A block that specifies the configuration options for Verified Access instances. Detailed below.
        :param pulumi.Input[str] verifiedaccess_instance_id: The ID of the Verified Access instance.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InstanceLoggingConfigurationState.__new__(_InstanceLoggingConfigurationState)

        __props__.__dict__["access_logs"] = access_logs
        __props__.__dict__["verifiedaccess_instance_id"] = verifiedaccess_instance_id
        return InstanceLoggingConfiguration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessLogs")
    def access_logs(self) -> pulumi.Output['outputs.InstanceLoggingConfigurationAccessLogs']:
        """
        A block that specifies the configuration options for Verified Access instances. Detailed below.
        """
        return pulumi.get(self, "access_logs")

    @property
    @pulumi.getter(name="verifiedaccessInstanceId")
    def verifiedaccess_instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the Verified Access instance.
        """
        return pulumi.get(self, "verifiedaccess_instance_id")

