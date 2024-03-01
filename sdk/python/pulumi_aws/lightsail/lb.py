# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['LbArgs', 'Lb']

@pulumi.input_type
class LbArgs:
    def __init__(__self__, *,
                 instance_port: pulumi.Input[int],
                 health_check_path: Optional[pulumi.Input[str]] = None,
                 ip_address_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Lb resource.
        :param pulumi.Input[int] instance_port: The instance port the load balancer will connect.
        :param pulumi.Input[str] health_check_path: The health check path of the load balancer. Default value "/".
        :param pulumi.Input[str] name: The name of the Lightsail load balancer.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "instance_port", instance_port)
        if health_check_path is not None:
            pulumi.set(__self__, "health_check_path", health_check_path)
        if ip_address_type is not None:
            pulumi.set(__self__, "ip_address_type", ip_address_type)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="instancePort")
    def instance_port(self) -> pulumi.Input[int]:
        """
        The instance port the load balancer will connect.
        """
        return pulumi.get(self, "instance_port")

    @instance_port.setter
    def instance_port(self, value: pulumi.Input[int]):
        pulumi.set(self, "instance_port", value)

    @property
    @pulumi.getter(name="healthCheckPath")
    def health_check_path(self) -> Optional[pulumi.Input[str]]:
        """
        The health check path of the load balancer. Default value "/".
        """
        return pulumi.get(self, "health_check_path")

    @health_check_path.setter
    def health_check_path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "health_check_path", value)

    @property
    @pulumi.getter(name="ipAddressType")
    def ip_address_type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ip_address_type")

    @ip_address_type.setter
    def ip_address_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_address_type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Lightsail load balancer.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _LbState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 dns_name: Optional[pulumi.Input[str]] = None,
                 health_check_path: Optional[pulumi.Input[str]] = None,
                 instance_port: Optional[pulumi.Input[int]] = None,
                 ip_address_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 protocol: Optional[pulumi.Input[str]] = None,
                 public_ports: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 support_code: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Lb resources.
        :param pulumi.Input[str] arn: The ARN of the Lightsail load balancer.
        :param pulumi.Input[str] created_at: The timestamp when the load balancer was created.
        :param pulumi.Input[str] dns_name: The DNS name of the load balancer.
        :param pulumi.Input[str] health_check_path: The health check path of the load balancer. Default value "/".
        :param pulumi.Input[int] instance_port: The instance port the load balancer will connect.
        :param pulumi.Input[str] name: The name of the Lightsail load balancer.
        :param pulumi.Input[str] protocol: The protocol of the load balancer.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] public_ports: The public ports of the load balancer.
        :param pulumi.Input[str] support_code: The support code for the database. Include this code in your email to support when you have questions about a database in Lightsail. This code enables our support team to look up your Lightsail information more easily.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if dns_name is not None:
            pulumi.set(__self__, "dns_name", dns_name)
        if health_check_path is not None:
            pulumi.set(__self__, "health_check_path", health_check_path)
        if instance_port is not None:
            pulumi.set(__self__, "instance_port", instance_port)
        if ip_address_type is not None:
            pulumi.set(__self__, "ip_address_type", ip_address_type)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if protocol is not None:
            pulumi.set(__self__, "protocol", protocol)
        if public_ports is not None:
            pulumi.set(__self__, "public_ports", public_ports)
        if support_code is not None:
            pulumi.set(__self__, "support_code", support_code)
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
        The ARN of the Lightsail load balancer.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        The timestamp when the load balancer was created.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="dnsName")
    def dns_name(self) -> Optional[pulumi.Input[str]]:
        """
        The DNS name of the load balancer.
        """
        return pulumi.get(self, "dns_name")

    @dns_name.setter
    def dns_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dns_name", value)

    @property
    @pulumi.getter(name="healthCheckPath")
    def health_check_path(self) -> Optional[pulumi.Input[str]]:
        """
        The health check path of the load balancer. Default value "/".
        """
        return pulumi.get(self, "health_check_path")

    @health_check_path.setter
    def health_check_path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "health_check_path", value)

    @property
    @pulumi.getter(name="instancePort")
    def instance_port(self) -> Optional[pulumi.Input[int]]:
        """
        The instance port the load balancer will connect.
        """
        return pulumi.get(self, "instance_port")

    @instance_port.setter
    def instance_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "instance_port", value)

    @property
    @pulumi.getter(name="ipAddressType")
    def ip_address_type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ip_address_type")

    @ip_address_type.setter
    def ip_address_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_address_type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Lightsail load balancer.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def protocol(self) -> Optional[pulumi.Input[str]]:
        """
        The protocol of the load balancer.
        """
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter(name="publicPorts")
    def public_ports(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]:
        """
        The public ports of the load balancer.
        """
        return pulumi.get(self, "public_ports")

    @public_ports.setter
    def public_ports(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]):
        pulumi.set(self, "public_ports", value)

    @property
    @pulumi.getter(name="supportCode")
    def support_code(self) -> Optional[pulumi.Input[str]]:
        """
        The support code for the database. Include this code in your email to support when you have questions about a database in Lightsail. This code enables our support team to look up your Lightsail information more easily.
        """
        return pulumi.get(self, "support_code")

    @support_code.setter
    def support_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "support_code", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class Lb(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 health_check_path: Optional[pulumi.Input[str]] = None,
                 instance_port: Optional[pulumi.Input[int]] = None,
                 ip_address_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Creates a Lightsail load balancer resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.lightsail.Lb("test",
            name="test-load-balancer",
            health_check_path="/",
            instance_port=80,
            tags={
                "foo": "bar",
            })
        ```

        ## Import

        Using `pulumi import`, import `aws_lightsail_lb` using the name attribute. For example:

        ```sh
         $ pulumi import aws:lightsail/lb:Lb test example-load-balancer
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] health_check_path: The health check path of the load balancer. Default value "/".
        :param pulumi.Input[int] instance_port: The instance port the load balancer will connect.
        :param pulumi.Input[str] name: The name of the Lightsail load balancer.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LbArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates a Lightsail load balancer resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.lightsail.Lb("test",
            name="test-load-balancer",
            health_check_path="/",
            instance_port=80,
            tags={
                "foo": "bar",
            })
        ```

        ## Import

        Using `pulumi import`, import `aws_lightsail_lb` using the name attribute. For example:

        ```sh
         $ pulumi import aws:lightsail/lb:Lb test example-load-balancer
        ```

        :param str resource_name: The name of the resource.
        :param LbArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LbArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 health_check_path: Optional[pulumi.Input[str]] = None,
                 instance_port: Optional[pulumi.Input[int]] = None,
                 ip_address_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LbArgs.__new__(LbArgs)

            __props__.__dict__["health_check_path"] = health_check_path
            if instance_port is None and not opts.urn:
                raise TypeError("Missing required property 'instance_port'")
            __props__.__dict__["instance_port"] = instance_port
            __props__.__dict__["ip_address_type"] = ip_address_type
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["created_at"] = None
            __props__.__dict__["dns_name"] = None
            __props__.__dict__["protocol"] = None
            __props__.__dict__["public_ports"] = None
            __props__.__dict__["support_code"] = None
            __props__.__dict__["tags_all"] = None
        super(Lb, __self__).__init__(
            'aws:lightsail/lb:Lb',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            dns_name: Optional[pulumi.Input[str]] = None,
            health_check_path: Optional[pulumi.Input[str]] = None,
            instance_port: Optional[pulumi.Input[int]] = None,
            ip_address_type: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            protocol: Optional[pulumi.Input[str]] = None,
            public_ports: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
            support_code: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'Lb':
        """
        Get an existing Lb resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the Lightsail load balancer.
        :param pulumi.Input[str] created_at: The timestamp when the load balancer was created.
        :param pulumi.Input[str] dns_name: The DNS name of the load balancer.
        :param pulumi.Input[str] health_check_path: The health check path of the load balancer. Default value "/".
        :param pulumi.Input[int] instance_port: The instance port the load balancer will connect.
        :param pulumi.Input[str] name: The name of the Lightsail load balancer.
        :param pulumi.Input[str] protocol: The protocol of the load balancer.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] public_ports: The public ports of the load balancer.
        :param pulumi.Input[str] support_code: The support code for the database. Include this code in your email to support when you have questions about a database in Lightsail. This code enables our support team to look up your Lightsail information more easily.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LbState.__new__(_LbState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["dns_name"] = dns_name
        __props__.__dict__["health_check_path"] = health_check_path
        __props__.__dict__["instance_port"] = instance_port
        __props__.__dict__["ip_address_type"] = ip_address_type
        __props__.__dict__["name"] = name
        __props__.__dict__["protocol"] = protocol
        __props__.__dict__["public_ports"] = public_ports
        __props__.__dict__["support_code"] = support_code
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return Lb(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the Lightsail load balancer.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        The timestamp when the load balancer was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="dnsName")
    def dns_name(self) -> pulumi.Output[str]:
        """
        The DNS name of the load balancer.
        """
        return pulumi.get(self, "dns_name")

    @property
    @pulumi.getter(name="healthCheckPath")
    def health_check_path(self) -> pulumi.Output[Optional[str]]:
        """
        The health check path of the load balancer. Default value "/".
        """
        return pulumi.get(self, "health_check_path")

    @property
    @pulumi.getter(name="instancePort")
    def instance_port(self) -> pulumi.Output[int]:
        """
        The instance port the load balancer will connect.
        """
        return pulumi.get(self, "instance_port")

    @property
    @pulumi.getter(name="ipAddressType")
    def ip_address_type(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "ip_address_type")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Lightsail load balancer.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def protocol(self) -> pulumi.Output[str]:
        """
        The protocol of the load balancer.
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter(name="publicPorts")
    def public_ports(self) -> pulumi.Output[Sequence[int]]:
        """
        The public ports of the load balancer.
        """
        return pulumi.get(self, "public_ports")

    @property
    @pulumi.getter(name="supportCode")
    def support_code(self) -> pulumi.Output[str]:
        """
        The support code for the database. Include this code in your email to support when you have questions about a database in Lightsail. This code enables our support team to look up your Lightsail information more easily.
        """
        return pulumi.get(self, "support_code")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

