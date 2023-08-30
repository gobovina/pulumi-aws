# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ProtectionHealthCheckAssociationArgs', 'ProtectionHealthCheckAssociation']

@pulumi.input_type
class ProtectionHealthCheckAssociationArgs:
    def __init__(__self__, *,
                 health_check_arn: pulumi.Input[str],
                 shield_protection_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a ProtectionHealthCheckAssociation resource.
        :param pulumi.Input[str] health_check_arn: The ARN (Amazon Resource Name) of the Route53 Health Check resource which will be associated to the protected resource.
        :param pulumi.Input[str] shield_protection_id: The ID of the protected resource.
        """
        pulumi.set(__self__, "health_check_arn", health_check_arn)
        pulumi.set(__self__, "shield_protection_id", shield_protection_id)

    @property
    @pulumi.getter(name="healthCheckArn")
    def health_check_arn(self) -> pulumi.Input[str]:
        """
        The ARN (Amazon Resource Name) of the Route53 Health Check resource which will be associated to the protected resource.
        """
        return pulumi.get(self, "health_check_arn")

    @health_check_arn.setter
    def health_check_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "health_check_arn", value)

    @property
    @pulumi.getter(name="shieldProtectionId")
    def shield_protection_id(self) -> pulumi.Input[str]:
        """
        The ID of the protected resource.
        """
        return pulumi.get(self, "shield_protection_id")

    @shield_protection_id.setter
    def shield_protection_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "shield_protection_id", value)


@pulumi.input_type
class _ProtectionHealthCheckAssociationState:
    def __init__(__self__, *,
                 health_check_arn: Optional[pulumi.Input[str]] = None,
                 shield_protection_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ProtectionHealthCheckAssociation resources.
        :param pulumi.Input[str] health_check_arn: The ARN (Amazon Resource Name) of the Route53 Health Check resource which will be associated to the protected resource.
        :param pulumi.Input[str] shield_protection_id: The ID of the protected resource.
        """
        if health_check_arn is not None:
            pulumi.set(__self__, "health_check_arn", health_check_arn)
        if shield_protection_id is not None:
            pulumi.set(__self__, "shield_protection_id", shield_protection_id)

    @property
    @pulumi.getter(name="healthCheckArn")
    def health_check_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN (Amazon Resource Name) of the Route53 Health Check resource which will be associated to the protected resource.
        """
        return pulumi.get(self, "health_check_arn")

    @health_check_arn.setter
    def health_check_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "health_check_arn", value)

    @property
    @pulumi.getter(name="shieldProtectionId")
    def shield_protection_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the protected resource.
        """
        return pulumi.get(self, "shield_protection_id")

    @shield_protection_id.setter
    def shield_protection_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "shield_protection_id", value)


class ProtectionHealthCheckAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 health_check_arn: Optional[pulumi.Input[str]] = None,
                 shield_protection_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates an association between a Route53 Health Check and a Shield Advanced protected resource.
        This association uses the health of your applications to improve responsiveness and accuracy in attack detection and mitigation.

        Blog post: [AWS Shield Advanced now supports Health Based Detection](https://aws.amazon.com/about-aws/whats-new/2020/02/aws-shield-advanced-now-supports-health-based-detection/)

        ## Example Usage
        ### Create an association between a protected EIP and a Route53 Health Check

        ```python
        import pulumi
        import pulumi_aws as aws

        current_region = aws.get_region()
        current_caller_identity = aws.get_caller_identity()
        current_partition = aws.get_partition()
        example_eip = aws.ec2.Eip("exampleEip",
            domain="vpc",
            tags={
                "Name": "example",
            })
        example_protection = aws.shield.Protection("exampleProtection", resource_arn=example_eip.id.apply(lambda id: f"arn:{current_partition.partition}:ec2:{current_region.name}:{current_caller_identity.account_id}:eip-allocation/{id}"))
        example_health_check = aws.route53.HealthCheck("exampleHealthCheck",
            ip_address=example_eip.public_ip,
            port=80,
            type="HTTP",
            resource_path="/ready",
            failure_threshold=3,
            request_interval=30,
            tags={
                "Name": "tf-example-health-check",
            })
        example_protection_health_check_association = aws.shield.ProtectionHealthCheckAssociation("exampleProtectionHealthCheckAssociation",
            health_check_arn=example_health_check.arn,
            shield_protection_id=example_protection.id)
        ```

        ## Import

        Using `pulumi import`, import Shield protection health check association resources using the `shield_protection_id` and `health_check_arn`. For example:

        ```sh
         $ pulumi import aws:shield/protectionHealthCheckAssociation:ProtectionHealthCheckAssociation example ff9592dc-22f3-4e88-afa1-7b29fde9669a+arn:aws:route53:::healthcheck/3742b175-edb9-46bc-9359-f53e3b794b1b
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] health_check_arn: The ARN (Amazon Resource Name) of the Route53 Health Check resource which will be associated to the protected resource.
        :param pulumi.Input[str] shield_protection_id: The ID of the protected resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProtectionHealthCheckAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates an association between a Route53 Health Check and a Shield Advanced protected resource.
        This association uses the health of your applications to improve responsiveness and accuracy in attack detection and mitigation.

        Blog post: [AWS Shield Advanced now supports Health Based Detection](https://aws.amazon.com/about-aws/whats-new/2020/02/aws-shield-advanced-now-supports-health-based-detection/)

        ## Example Usage
        ### Create an association between a protected EIP and a Route53 Health Check

        ```python
        import pulumi
        import pulumi_aws as aws

        current_region = aws.get_region()
        current_caller_identity = aws.get_caller_identity()
        current_partition = aws.get_partition()
        example_eip = aws.ec2.Eip("exampleEip",
            domain="vpc",
            tags={
                "Name": "example",
            })
        example_protection = aws.shield.Protection("exampleProtection", resource_arn=example_eip.id.apply(lambda id: f"arn:{current_partition.partition}:ec2:{current_region.name}:{current_caller_identity.account_id}:eip-allocation/{id}"))
        example_health_check = aws.route53.HealthCheck("exampleHealthCheck",
            ip_address=example_eip.public_ip,
            port=80,
            type="HTTP",
            resource_path="/ready",
            failure_threshold=3,
            request_interval=30,
            tags={
                "Name": "tf-example-health-check",
            })
        example_protection_health_check_association = aws.shield.ProtectionHealthCheckAssociation("exampleProtectionHealthCheckAssociation",
            health_check_arn=example_health_check.arn,
            shield_protection_id=example_protection.id)
        ```

        ## Import

        Using `pulumi import`, import Shield protection health check association resources using the `shield_protection_id` and `health_check_arn`. For example:

        ```sh
         $ pulumi import aws:shield/protectionHealthCheckAssociation:ProtectionHealthCheckAssociation example ff9592dc-22f3-4e88-afa1-7b29fde9669a+arn:aws:route53:::healthcheck/3742b175-edb9-46bc-9359-f53e3b794b1b
        ```

        :param str resource_name: The name of the resource.
        :param ProtectionHealthCheckAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProtectionHealthCheckAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 health_check_arn: Optional[pulumi.Input[str]] = None,
                 shield_protection_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProtectionHealthCheckAssociationArgs.__new__(ProtectionHealthCheckAssociationArgs)

            if health_check_arn is None and not opts.urn:
                raise TypeError("Missing required property 'health_check_arn'")
            __props__.__dict__["health_check_arn"] = health_check_arn
            if shield_protection_id is None and not opts.urn:
                raise TypeError("Missing required property 'shield_protection_id'")
            __props__.__dict__["shield_protection_id"] = shield_protection_id
        super(ProtectionHealthCheckAssociation, __self__).__init__(
            'aws:shield/protectionHealthCheckAssociation:ProtectionHealthCheckAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            health_check_arn: Optional[pulumi.Input[str]] = None,
            shield_protection_id: Optional[pulumi.Input[str]] = None) -> 'ProtectionHealthCheckAssociation':
        """
        Get an existing ProtectionHealthCheckAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] health_check_arn: The ARN (Amazon Resource Name) of the Route53 Health Check resource which will be associated to the protected resource.
        :param pulumi.Input[str] shield_protection_id: The ID of the protected resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProtectionHealthCheckAssociationState.__new__(_ProtectionHealthCheckAssociationState)

        __props__.__dict__["health_check_arn"] = health_check_arn
        __props__.__dict__["shield_protection_id"] = shield_protection_id
        return ProtectionHealthCheckAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="healthCheckArn")
    def health_check_arn(self) -> pulumi.Output[str]:
        """
        The ARN (Amazon Resource Name) of the Route53 Health Check resource which will be associated to the protected resource.
        """
        return pulumi.get(self, "health_check_arn")

    @property
    @pulumi.getter(name="shieldProtectionId")
    def shield_protection_id(self) -> pulumi.Output[str]:
        """
        The ID of the protected resource.
        """
        return pulumi.get(self, "shield_protection_id")

