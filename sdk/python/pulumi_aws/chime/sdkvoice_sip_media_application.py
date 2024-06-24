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

__all__ = ['SdkvoiceSipMediaApplicationArgs', 'SdkvoiceSipMediaApplication']

@pulumi.input_type
class SdkvoiceSipMediaApplicationArgs:
    def __init__(__self__, *,
                 aws_region: pulumi.Input[str],
                 endpoints: pulumi.Input['SdkvoiceSipMediaApplicationEndpointsArgs'],
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a SdkvoiceSipMediaApplication resource.
        :param pulumi.Input[str] aws_region: The AWS Region in which the AWS Chime SDK Voice Sip Media Application is created.
        :param pulumi.Input['SdkvoiceSipMediaApplicationEndpointsArgs'] endpoints: List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one endpoint is supported. See `endpoints`.
        :param pulumi.Input[str] name: The name of the AWS Chime SDK Voice Sip Media Application.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "aws_region", aws_region)
        pulumi.set(__self__, "endpoints", endpoints)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="awsRegion")
    def aws_region(self) -> pulumi.Input[str]:
        """
        The AWS Region in which the AWS Chime SDK Voice Sip Media Application is created.
        """
        return pulumi.get(self, "aws_region")

    @aws_region.setter
    def aws_region(self, value: pulumi.Input[str]):
        pulumi.set(self, "aws_region", value)

    @property
    @pulumi.getter
    def endpoints(self) -> pulumi.Input['SdkvoiceSipMediaApplicationEndpointsArgs']:
        """
        List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one endpoint is supported. See `endpoints`.
        """
        return pulumi.get(self, "endpoints")

    @endpoints.setter
    def endpoints(self, value: pulumi.Input['SdkvoiceSipMediaApplicationEndpointsArgs']):
        pulumi.set(self, "endpoints", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the AWS Chime SDK Voice Sip Media Application.

        The following arguments are optional:
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _SdkvoiceSipMediaApplicationState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 aws_region: Optional[pulumi.Input[str]] = None,
                 endpoints: Optional[pulumi.Input['SdkvoiceSipMediaApplicationEndpointsArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering SdkvoiceSipMediaApplication resources.
        :param pulumi.Input[str] arn: ARN (Amazon Resource Name) of the AWS Chime SDK Voice Sip Media Application
        :param pulumi.Input[str] aws_region: The AWS Region in which the AWS Chime SDK Voice Sip Media Application is created.
        :param pulumi.Input['SdkvoiceSipMediaApplicationEndpointsArgs'] endpoints: List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one endpoint is supported. See `endpoints`.
        :param pulumi.Input[str] name: The name of the AWS Chime SDK Voice Sip Media Application.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if aws_region is not None:
            pulumi.set(__self__, "aws_region", aws_region)
        if endpoints is not None:
            pulumi.set(__self__, "endpoints", endpoints)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN (Amazon Resource Name) of the AWS Chime SDK Voice Sip Media Application
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="awsRegion")
    def aws_region(self) -> Optional[pulumi.Input[str]]:
        """
        The AWS Region in which the AWS Chime SDK Voice Sip Media Application is created.
        """
        return pulumi.get(self, "aws_region")

    @aws_region.setter
    def aws_region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aws_region", value)

    @property
    @pulumi.getter
    def endpoints(self) -> Optional[pulumi.Input['SdkvoiceSipMediaApplicationEndpointsArgs']]:
        """
        List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one endpoint is supported. See `endpoints`.
        """
        return pulumi.get(self, "endpoints")

    @endpoints.setter
    def endpoints(self, value: Optional[pulumi.Input['SdkvoiceSipMediaApplicationEndpointsArgs']]):
        pulumi.set(self, "endpoints", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the AWS Chime SDK Voice Sip Media Application.

        The following arguments are optional:
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class SdkvoiceSipMediaApplication(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws_region: Optional[pulumi.Input[str]] = None,
                 endpoints: Optional[pulumi.Input[pulumi.InputType['SdkvoiceSipMediaApplicationEndpointsArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        A ChimeSDKVoice SIP Media Application is a managed object that passes values from a SIP rule to a target AWS Lambda function.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.chime.SdkvoiceSipMediaApplication("example",
            aws_region="us-east-1",
            name="example-sip-media-application",
            endpoints=aws.chime.SdkvoiceSipMediaApplicationEndpointsArgs(
                lambda_arn=test["arn"],
            ))
        ```

        ## Import

        Using `pulumi import`, import a ChimeSDKVoice SIP Media Application using the `id`. For example:

        ```sh
        $ pulumi import aws:chime/sdkvoiceSipMediaApplication:SdkvoiceSipMediaApplication example abcdef123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] aws_region: The AWS Region in which the AWS Chime SDK Voice Sip Media Application is created.
        :param pulumi.Input[pulumi.InputType['SdkvoiceSipMediaApplicationEndpointsArgs']] endpoints: List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one endpoint is supported. See `endpoints`.
        :param pulumi.Input[str] name: The name of the AWS Chime SDK Voice Sip Media Application.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SdkvoiceSipMediaApplicationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A ChimeSDKVoice SIP Media Application is a managed object that passes values from a SIP rule to a target AWS Lambda function.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.chime.SdkvoiceSipMediaApplication("example",
            aws_region="us-east-1",
            name="example-sip-media-application",
            endpoints=aws.chime.SdkvoiceSipMediaApplicationEndpointsArgs(
                lambda_arn=test["arn"],
            ))
        ```

        ## Import

        Using `pulumi import`, import a ChimeSDKVoice SIP Media Application using the `id`. For example:

        ```sh
        $ pulumi import aws:chime/sdkvoiceSipMediaApplication:SdkvoiceSipMediaApplication example abcdef123456
        ```

        :param str resource_name: The name of the resource.
        :param SdkvoiceSipMediaApplicationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SdkvoiceSipMediaApplicationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws_region: Optional[pulumi.Input[str]] = None,
                 endpoints: Optional[pulumi.Input[pulumi.InputType['SdkvoiceSipMediaApplicationEndpointsArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SdkvoiceSipMediaApplicationArgs.__new__(SdkvoiceSipMediaApplicationArgs)

            if aws_region is None and not opts.urn:
                raise TypeError("Missing required property 'aws_region'")
            __props__.__dict__["aws_region"] = aws_region
            if endpoints is None and not opts.urn:
                raise TypeError("Missing required property 'endpoints'")
            __props__.__dict__["endpoints"] = endpoints
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(SdkvoiceSipMediaApplication, __self__).__init__(
            'aws:chime/sdkvoiceSipMediaApplication:SdkvoiceSipMediaApplication',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            aws_region: Optional[pulumi.Input[str]] = None,
            endpoints: Optional[pulumi.Input[pulumi.InputType['SdkvoiceSipMediaApplicationEndpointsArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'SdkvoiceSipMediaApplication':
        """
        Get an existing SdkvoiceSipMediaApplication resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: ARN (Amazon Resource Name) of the AWS Chime SDK Voice Sip Media Application
        :param pulumi.Input[str] aws_region: The AWS Region in which the AWS Chime SDK Voice Sip Media Application is created.
        :param pulumi.Input[pulumi.InputType['SdkvoiceSipMediaApplicationEndpointsArgs']] endpoints: List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one endpoint is supported. See `endpoints`.
        :param pulumi.Input[str] name: The name of the AWS Chime SDK Voice Sip Media Application.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SdkvoiceSipMediaApplicationState.__new__(_SdkvoiceSipMediaApplicationState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["aws_region"] = aws_region
        __props__.__dict__["endpoints"] = endpoints
        __props__.__dict__["name"] = name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return SdkvoiceSipMediaApplication(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN (Amazon Resource Name) of the AWS Chime SDK Voice Sip Media Application
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="awsRegion")
    def aws_region(self) -> pulumi.Output[str]:
        """
        The AWS Region in which the AWS Chime SDK Voice Sip Media Application is created.
        """
        return pulumi.get(self, "aws_region")

    @property
    @pulumi.getter
    def endpoints(self) -> pulumi.Output['outputs.SdkvoiceSipMediaApplicationEndpoints']:
        """
        List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one endpoint is supported. See `endpoints`.
        """
        return pulumi.get(self, "endpoints")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the AWS Chime SDK Voice Sip Media Application.

        The following arguments are optional:
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

