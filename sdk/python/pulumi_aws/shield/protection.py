# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ProtectionArgs', 'Protection']

@pulumi.input_type
class ProtectionArgs:
    def __init__(__self__, *,
                 resource_arn: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Protection resource.
        :param pulumi.Input[str] resource_arn: The ARN (Amazon Resource Name) of the resource to be protected.
        :param pulumi.Input[str] name: A friendly name for the Protection you are creating.
        """
        pulumi.set(__self__, "resource_arn", resource_arn)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="resourceArn")
    def resource_arn(self) -> pulumi.Input[str]:
        """
        The ARN (Amazon Resource Name) of the resource to be protected.
        """
        return pulumi.get(self, "resource_arn")

    @resource_arn.setter
    def resource_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_arn", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A friendly name for the Protection you are creating.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _ProtectionState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_arn: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Protection resources.
        :param pulumi.Input[str] name: A friendly name for the Protection you are creating.
        :param pulumi.Input[str] resource_arn: The ARN (Amazon Resource Name) of the resource to be protected.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_arn is not None:
            pulumi.set(__self__, "resource_arn", resource_arn)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A friendly name for the Protection you are creating.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="resourceArn")
    def resource_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN (Amazon Resource Name) of the resource to be protected.
        """
        return pulumi.get(self, "resource_arn")

    @resource_arn.setter
    def resource_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_arn", value)


class Protection(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Enables AWS Shield Advanced for a specific AWS resource.
        The resource can be an Amazon CloudFront distribution, Elastic Load Balancing load balancer, AWS Global Accelerator accelerator, Elastic IP Address, or an Amazon Route 53 hosted zone.

        ## Example Usage
        ### Create protection

        ```python
        import pulumi
        import pulumi_aws as aws

        available = aws.get_availability_zones()
        current_region = aws.get_region()
        current_caller_identity = aws.get_caller_identity()
        example_eip = aws.ec2.Eip("exampleEip", vpc=True)
        example_protection = aws.shield.Protection("exampleProtection", resource_arn=example_eip.id.apply(lambda id: f"arn:aws:ec2:{current_region.name}:{current_caller_identity.account_id}:eip-allocation/{id}"))
        ```

        ## Import

        Shield protection resources can be imported by specifying their ID e.g.

        ```sh
         $ pulumi import aws:shield/protection:Protection example ff9592dc-22f3-4e88-afa1-7b29fde9669a
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: A friendly name for the Protection you are creating.
        :param pulumi.Input[str] resource_arn: The ARN (Amazon Resource Name) of the resource to be protected.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProtectionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Enables AWS Shield Advanced for a specific AWS resource.
        The resource can be an Amazon CloudFront distribution, Elastic Load Balancing load balancer, AWS Global Accelerator accelerator, Elastic IP Address, or an Amazon Route 53 hosted zone.

        ## Example Usage
        ### Create protection

        ```python
        import pulumi
        import pulumi_aws as aws

        available = aws.get_availability_zones()
        current_region = aws.get_region()
        current_caller_identity = aws.get_caller_identity()
        example_eip = aws.ec2.Eip("exampleEip", vpc=True)
        example_protection = aws.shield.Protection("exampleProtection", resource_arn=example_eip.id.apply(lambda id: f"arn:aws:ec2:{current_region.name}:{current_caller_identity.account_id}:eip-allocation/{id}"))
        ```

        ## Import

        Shield protection resources can be imported by specifying their ID e.g.

        ```sh
         $ pulumi import aws:shield/protection:Protection example ff9592dc-22f3-4e88-afa1-7b29fde9669a
        ```

        :param str resource_name: The name of the resource.
        :param ProtectionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProtectionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProtectionArgs.__new__(ProtectionArgs)

            __props__.__dict__["name"] = name
            if resource_arn is None and not opts.urn:
                raise TypeError("Missing required property 'resource_arn'")
            __props__.__dict__["resource_arn"] = resource_arn
        super(Protection, __self__).__init__(
            'aws:shield/protection:Protection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[str]] = None,
            resource_arn: Optional[pulumi.Input[str]] = None) -> 'Protection':
        """
        Get an existing Protection resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: A friendly name for the Protection you are creating.
        :param pulumi.Input[str] resource_arn: The ARN (Amazon Resource Name) of the resource to be protected.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProtectionState.__new__(_ProtectionState)

        __props__.__dict__["name"] = name
        __props__.__dict__["resource_arn"] = resource_arn
        return Protection(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        A friendly name for the Protection you are creating.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceArn")
    def resource_arn(self) -> pulumi.Output[str]:
        """
        The ARN (Amazon Resource Name) of the resource to be protected.
        """
        return pulumi.get(self, "resource_arn")

