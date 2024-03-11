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

__all__ = ['ObjectLambdaAccessPointArgs', 'ObjectLambdaAccessPoint']

@pulumi.input_type
class ObjectLambdaAccessPointArgs:
    def __init__(__self__, *,
                 configuration: pulumi.Input['ObjectLambdaAccessPointConfigurationArgs'],
                 account_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ObjectLambdaAccessPoint resource.
        :param pulumi.Input['ObjectLambdaAccessPointConfigurationArgs'] configuration: A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
        :param pulumi.Input[str] account_id: The AWS account ID for the owner of the bucket for which you want to create an Object Lambda Access Point. Defaults to automatically determined account ID of the AWS provider.
        :param pulumi.Input[str] name: The name for this Object Lambda Access Point.
        """
        pulumi.set(__self__, "configuration", configuration)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def configuration(self) -> pulumi.Input['ObjectLambdaAccessPointConfigurationArgs']:
        """
        A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
        """
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: pulumi.Input['ObjectLambdaAccessPointConfigurationArgs']):
        pulumi.set(self, "configuration", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The AWS account ID for the owner of the bucket for which you want to create an Object Lambda Access Point. Defaults to automatically determined account ID of the AWS provider.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for this Object Lambda Access Point.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _ObjectLambdaAccessPointState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 alias: Optional[pulumi.Input[str]] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 configuration: Optional[pulumi.Input['ObjectLambdaAccessPointConfigurationArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ObjectLambdaAccessPoint resources.
        :param pulumi.Input[str] account_id: The AWS account ID for the owner of the bucket for which you want to create an Object Lambda Access Point. Defaults to automatically determined account ID of the AWS provider.
        :param pulumi.Input[str] alias: Alias for the S3 Object Lambda Access Point.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the Object Lambda Access Point.
        :param pulumi.Input['ObjectLambdaAccessPointConfigurationArgs'] configuration: A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
        :param pulumi.Input[str] name: The name for this Object Lambda Access Point.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if alias is not None:
            pulumi.set(__self__, "alias", alias)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if configuration is not None:
            pulumi.set(__self__, "configuration", configuration)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The AWS account ID for the owner of the bucket for which you want to create an Object Lambda Access Point. Defaults to automatically determined account ID of the AWS provider.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def alias(self) -> Optional[pulumi.Input[str]]:
        """
        Alias for the S3 Object Lambda Access Point.
        """
        return pulumi.get(self, "alias")

    @alias.setter
    def alias(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alias", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the Object Lambda Access Point.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def configuration(self) -> Optional[pulumi.Input['ObjectLambdaAccessPointConfigurationArgs']]:
        """
        A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
        """
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: Optional[pulumi.Input['ObjectLambdaAccessPointConfigurationArgs']]):
        pulumi.set(self, "configuration", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for this Object Lambda Access Point.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class ObjectLambdaAccessPoint(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 configuration: Optional[pulumi.Input[pulumi.InputType['ObjectLambdaAccessPointConfigurationArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource to manage an S3 Object Lambda Access Point.
        An Object Lambda access point is associated with exactly one standard access point and thus one Amazon S3 bucket.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.s3.BucketV2("example", bucket="example")
        example_access_point = aws.s3.AccessPoint("example",
            bucket=example.id,
            name="example")
        example_object_lambda_access_point = aws.s3control.ObjectLambdaAccessPoint("example",
            name="example",
            configuration=aws.s3control.ObjectLambdaAccessPointConfigurationArgs(
                supporting_access_point=example_access_point.arn,
                transformation_configurations=[aws.s3control.ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs(
                    actions=["GetObject"],
                    content_transformation=aws.s3control.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationArgs(
                        aws_lambda=aws.s3control.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambdaArgs(
                            function_arn=example_aws_lambda_function["arn"],
                        ),
                    ),
                )],
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Object Lambda Access Points using the `account_id` and `name`, separated by a colon (`:`). For example:

        ```sh
        $ pulumi import aws:s3control/objectLambdaAccessPoint:ObjectLambdaAccessPoint example 123456789012:example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The AWS account ID for the owner of the bucket for which you want to create an Object Lambda Access Point. Defaults to automatically determined account ID of the AWS provider.
        :param pulumi.Input[pulumi.InputType['ObjectLambdaAccessPointConfigurationArgs']] configuration: A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
        :param pulumi.Input[str] name: The name for this Object Lambda Access Point.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ObjectLambdaAccessPointArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to manage an S3 Object Lambda Access Point.
        An Object Lambda access point is associated with exactly one standard access point and thus one Amazon S3 bucket.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.s3.BucketV2("example", bucket="example")
        example_access_point = aws.s3.AccessPoint("example",
            bucket=example.id,
            name="example")
        example_object_lambda_access_point = aws.s3control.ObjectLambdaAccessPoint("example",
            name="example",
            configuration=aws.s3control.ObjectLambdaAccessPointConfigurationArgs(
                supporting_access_point=example_access_point.arn,
                transformation_configurations=[aws.s3control.ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs(
                    actions=["GetObject"],
                    content_transformation=aws.s3control.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationArgs(
                        aws_lambda=aws.s3control.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambdaArgs(
                            function_arn=example_aws_lambda_function["arn"],
                        ),
                    ),
                )],
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Object Lambda Access Points using the `account_id` and `name`, separated by a colon (`:`). For example:

        ```sh
        $ pulumi import aws:s3control/objectLambdaAccessPoint:ObjectLambdaAccessPoint example 123456789012:example
        ```

        :param str resource_name: The name of the resource.
        :param ObjectLambdaAccessPointArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ObjectLambdaAccessPointArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 configuration: Optional[pulumi.Input[pulumi.InputType['ObjectLambdaAccessPointConfigurationArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ObjectLambdaAccessPointArgs.__new__(ObjectLambdaAccessPointArgs)

            __props__.__dict__["account_id"] = account_id
            if configuration is None and not opts.urn:
                raise TypeError("Missing required property 'configuration'")
            __props__.__dict__["configuration"] = configuration
            __props__.__dict__["name"] = name
            __props__.__dict__["alias"] = None
            __props__.__dict__["arn"] = None
        super(ObjectLambdaAccessPoint, __self__).__init__(
            'aws:s3control/objectLambdaAccessPoint:ObjectLambdaAccessPoint',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            alias: Optional[pulumi.Input[str]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            configuration: Optional[pulumi.Input[pulumi.InputType['ObjectLambdaAccessPointConfigurationArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'ObjectLambdaAccessPoint':
        """
        Get an existing ObjectLambdaAccessPoint resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The AWS account ID for the owner of the bucket for which you want to create an Object Lambda Access Point. Defaults to automatically determined account ID of the AWS provider.
        :param pulumi.Input[str] alias: Alias for the S3 Object Lambda Access Point.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the Object Lambda Access Point.
        :param pulumi.Input[pulumi.InputType['ObjectLambdaAccessPointConfigurationArgs']] configuration: A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
        :param pulumi.Input[str] name: The name for this Object Lambda Access Point.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ObjectLambdaAccessPointState.__new__(_ObjectLambdaAccessPointState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["alias"] = alias
        __props__.__dict__["arn"] = arn
        __props__.__dict__["configuration"] = configuration
        __props__.__dict__["name"] = name
        return ObjectLambdaAccessPoint(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The AWS account ID for the owner of the bucket for which you want to create an Object Lambda Access Point. Defaults to automatically determined account ID of the AWS provider.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def alias(self) -> pulumi.Output[str]:
        """
        Alias for the S3 Object Lambda Access Point.
        """
        return pulumi.get(self, "alias")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the Object Lambda Access Point.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def configuration(self) -> pulumi.Output['outputs.ObjectLambdaAccessPointConfiguration']:
        """
        A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
        """
        return pulumi.get(self, "configuration")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name for this Object Lambda Access Point.
        """
        return pulumi.get(self, "name")

