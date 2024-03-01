# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['LbAttachmentArgs', 'LbAttachment']

@pulumi.input_type
class LbAttachmentArgs:
    def __init__(__self__, *,
                 instance_name: pulumi.Input[str],
                 lb_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a LbAttachment resource.
        :param pulumi.Input[str] instance_name: The name of the instance to attach to the load balancer.
        :param pulumi.Input[str] lb_name: The name of the Lightsail load balancer.
        """
        pulumi.set(__self__, "instance_name", instance_name)
        pulumi.set(__self__, "lb_name", lb_name)

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> pulumi.Input[str]:
        """
        The name of the instance to attach to the load balancer.
        """
        return pulumi.get(self, "instance_name")

    @instance_name.setter
    def instance_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_name", value)

    @property
    @pulumi.getter(name="lbName")
    def lb_name(self) -> pulumi.Input[str]:
        """
        The name of the Lightsail load balancer.
        """
        return pulumi.get(self, "lb_name")

    @lb_name.setter
    def lb_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "lb_name", value)


@pulumi.input_type
class _LbAttachmentState:
    def __init__(__self__, *,
                 instance_name: Optional[pulumi.Input[str]] = None,
                 lb_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LbAttachment resources.
        :param pulumi.Input[str] instance_name: The name of the instance to attach to the load balancer.
        :param pulumi.Input[str] lb_name: The name of the Lightsail load balancer.
        """
        if instance_name is not None:
            pulumi.set(__self__, "instance_name", instance_name)
        if lb_name is not None:
            pulumi.set(__self__, "lb_name", lb_name)

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the instance to attach to the load balancer.
        """
        return pulumi.get(self, "instance_name")

    @instance_name.setter
    def instance_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_name", value)

    @property
    @pulumi.getter(name="lbName")
    def lb_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Lightsail load balancer.
        """
        return pulumi.get(self, "lb_name")

    @lb_name.setter
    def lb_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "lb_name", value)


class LbAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_name: Optional[pulumi.Input[str]] = None,
                 lb_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Attaches a Lightsail Instance to a Lightsail Load Balancer.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        available = aws.get_availability_zones(state="available",
            filters=[aws.GetAvailabilityZonesFilterArgs(
                name="opt-in-status",
                values=["opt-in-not-required"],
            )])
        test = aws.lightsail.Lb("test",
            name="test-load-balancer",
            health_check_path="/",
            instance_port=80,
            tags={
                "foo": "bar",
            })
        test_instance = aws.lightsail.Instance("test",
            name="test-instance",
            availability_zone=available.names[0],
            blueprint_id="amazon_linux_2",
            bundle_id="nano_1_0")
        test_lb_attachment = aws.lightsail.LbAttachment("test",
            lb_name=test.name,
            instance_name=test_instance.name)
        ```

        ## Import

        Using `pulumi import`, import `aws_lightsail_lb_attachment` using the name attribute. For example:

        ```sh
         $ pulumi import aws:lightsail/lbAttachment:LbAttachment test example-load-balancer,example-instance
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_name: The name of the instance to attach to the load balancer.
        :param pulumi.Input[str] lb_name: The name of the Lightsail load balancer.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LbAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Attaches a Lightsail Instance to a Lightsail Load Balancer.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        available = aws.get_availability_zones(state="available",
            filters=[aws.GetAvailabilityZonesFilterArgs(
                name="opt-in-status",
                values=["opt-in-not-required"],
            )])
        test = aws.lightsail.Lb("test",
            name="test-load-balancer",
            health_check_path="/",
            instance_port=80,
            tags={
                "foo": "bar",
            })
        test_instance = aws.lightsail.Instance("test",
            name="test-instance",
            availability_zone=available.names[0],
            blueprint_id="amazon_linux_2",
            bundle_id="nano_1_0")
        test_lb_attachment = aws.lightsail.LbAttachment("test",
            lb_name=test.name,
            instance_name=test_instance.name)
        ```

        ## Import

        Using `pulumi import`, import `aws_lightsail_lb_attachment` using the name attribute. For example:

        ```sh
         $ pulumi import aws:lightsail/lbAttachment:LbAttachment test example-load-balancer,example-instance
        ```

        :param str resource_name: The name of the resource.
        :param LbAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LbAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_name: Optional[pulumi.Input[str]] = None,
                 lb_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LbAttachmentArgs.__new__(LbAttachmentArgs)

            if instance_name is None and not opts.urn:
                raise TypeError("Missing required property 'instance_name'")
            __props__.__dict__["instance_name"] = instance_name
            if lb_name is None and not opts.urn:
                raise TypeError("Missing required property 'lb_name'")
            __props__.__dict__["lb_name"] = lb_name
        super(LbAttachment, __self__).__init__(
            'aws:lightsail/lbAttachment:LbAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            instance_name: Optional[pulumi.Input[str]] = None,
            lb_name: Optional[pulumi.Input[str]] = None) -> 'LbAttachment':
        """
        Get an existing LbAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_name: The name of the instance to attach to the load balancer.
        :param pulumi.Input[str] lb_name: The name of the Lightsail load balancer.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LbAttachmentState.__new__(_LbAttachmentState)

        __props__.__dict__["instance_name"] = instance_name
        __props__.__dict__["lb_name"] = lb_name
        return LbAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> pulumi.Output[str]:
        """
        The name of the instance to attach to the load balancer.
        """
        return pulumi.get(self, "instance_name")

    @property
    @pulumi.getter(name="lbName")
    def lb_name(self) -> pulumi.Output[str]:
        """
        The name of the Lightsail load balancer.
        """
        return pulumi.get(self, "lb_name")

