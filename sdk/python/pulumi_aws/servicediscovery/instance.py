# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['InstanceArgs', 'Instance']

@pulumi.input_type
class InstanceArgs:
    def __init__(__self__, *,
                 attributes: pulumi.Input[Mapping[str, pulumi.Input[str]]],
                 instance_id: pulumi.Input[str],
                 service_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a Instance resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] attributes: A map contains the attributes of the instance. Check the [doc](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#API_RegisterInstance_RequestSyntax) for the supported attributes and syntax.
        :param pulumi.Input[str] instance_id: The ID of the service instance.
        :param pulumi.Input[str] service_id: The ID of the service that you want to use to create the instance.
        """
        pulumi.set(__self__, "attributes", attributes)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "service_id", service_id)

    @property
    @pulumi.getter
    def attributes(self) -> pulumi.Input[Mapping[str, pulumi.Input[str]]]:
        """
        A map contains the attributes of the instance. Check the [doc](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#API_RegisterInstance_RequestSyntax) for the supported attributes and syntax.
        """
        return pulumi.get(self, "attributes")

    @attributes.setter
    def attributes(self, value: pulumi.Input[Mapping[str, pulumi.Input[str]]]):
        pulumi.set(self, "attributes", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        The ID of the service instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Input[str]:
        """
        The ID of the service that you want to use to create the instance.
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_id", value)


@pulumi.input_type
class _InstanceState:
    def __init__(__self__, *,
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 service_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Instance resources.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] attributes: A map contains the attributes of the instance. Check the [doc](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#API_RegisterInstance_RequestSyntax) for the supported attributes and syntax.
        :param pulumi.Input[str] instance_id: The ID of the service instance.
        :param pulumi.Input[str] service_id: The ID of the service that you want to use to create the instance.
        """
        if attributes is not None:
            pulumi.set(__self__, "attributes", attributes)
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if service_id is not None:
            pulumi.set(__self__, "service_id", service_id)

    @property
    @pulumi.getter
    def attributes(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map contains the attributes of the instance. Check the [doc](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#API_RegisterInstance_RequestSyntax) for the supported attributes and syntax.
        """
        return pulumi.get(self, "attributes")

    @attributes.setter
    def attributes(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "attributes", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the service instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the service that you want to use to create the instance.
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_id", value)


class Instance(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Service Discovery Instance resource.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2.Vpc("example",
            cidr_block="10.0.0.0/16",
            enable_dns_support=True,
            enable_dns_hostnames=True)
        example_private_dns_namespace = aws.servicediscovery.PrivateDnsNamespace("example",
            name="example.domain.local",
            description="example",
            vpc=example.id)
        example_service = aws.servicediscovery.Service("example",
            name="example",
            dns_config=aws.servicediscovery.ServiceDnsConfigArgs(
                namespace_id=example_private_dns_namespace.id,
                dns_records=[aws.servicediscovery.ServiceDnsConfigDnsRecordArgs(
                    ttl=10,
                    type="A",
                )],
                routing_policy="MULTIVALUE",
            ),
            health_check_custom_config=aws.servicediscovery.ServiceHealthCheckCustomConfigArgs(
                failure_threshold=1,
            ))
        example_instance = aws.servicediscovery.Instance("example",
            instance_id="example-instance-id",
            service_id=example_service.id,
            attributes={
                "AWS_INSTANCE_IPV4": "172.18.0.1",
                "custom_attribute": "custom",
            })
        ```
        <!--End PulumiCodeChooser -->

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.servicediscovery.HttpNamespace("example",
            name="example.domain.test",
            description="example")
        example_service = aws.servicediscovery.Service("example",
            name="example",
            namespace_id=example.id)
        example_instance = aws.servicediscovery.Instance("example",
            instance_id="example-instance-id",
            service_id=example_service.id,
            attributes={
                "AWS_EC2_INSTANCE_ID": "i-0abdg374kd892cj6dl",
            })
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Service Discovery Instance using the service ID and instance ID. For example:

        ```sh
        $ pulumi import aws:servicediscovery/instance:Instance example 0123456789/i-0123
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] attributes: A map contains the attributes of the instance. Check the [doc](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#API_RegisterInstance_RequestSyntax) for the supported attributes and syntax.
        :param pulumi.Input[str] instance_id: The ID of the service instance.
        :param pulumi.Input[str] service_id: The ID of the service that you want to use to create the instance.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: InstanceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Service Discovery Instance resource.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2.Vpc("example",
            cidr_block="10.0.0.0/16",
            enable_dns_support=True,
            enable_dns_hostnames=True)
        example_private_dns_namespace = aws.servicediscovery.PrivateDnsNamespace("example",
            name="example.domain.local",
            description="example",
            vpc=example.id)
        example_service = aws.servicediscovery.Service("example",
            name="example",
            dns_config=aws.servicediscovery.ServiceDnsConfigArgs(
                namespace_id=example_private_dns_namespace.id,
                dns_records=[aws.servicediscovery.ServiceDnsConfigDnsRecordArgs(
                    ttl=10,
                    type="A",
                )],
                routing_policy="MULTIVALUE",
            ),
            health_check_custom_config=aws.servicediscovery.ServiceHealthCheckCustomConfigArgs(
                failure_threshold=1,
            ))
        example_instance = aws.servicediscovery.Instance("example",
            instance_id="example-instance-id",
            service_id=example_service.id,
            attributes={
                "AWS_INSTANCE_IPV4": "172.18.0.1",
                "custom_attribute": "custom",
            })
        ```
        <!--End PulumiCodeChooser -->

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.servicediscovery.HttpNamespace("example",
            name="example.domain.test",
            description="example")
        example_service = aws.servicediscovery.Service("example",
            name="example",
            namespace_id=example.id)
        example_instance = aws.servicediscovery.Instance("example",
            instance_id="example-instance-id",
            service_id=example_service.id,
            attributes={
                "AWS_EC2_INSTANCE_ID": "i-0abdg374kd892cj6dl",
            })
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Service Discovery Instance using the service ID and instance ID. For example:

        ```sh
        $ pulumi import aws:servicediscovery/instance:Instance example 0123456789/i-0123
        ```

        :param str resource_name: The name of the resource.
        :param InstanceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(InstanceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InstanceArgs.__new__(InstanceArgs)

            if attributes is None and not opts.urn:
                raise TypeError("Missing required property 'attributes'")
            __props__.__dict__["attributes"] = attributes
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            if service_id is None and not opts.urn:
                raise TypeError("Missing required property 'service_id'")
            __props__.__dict__["service_id"] = service_id
        super(Instance, __self__).__init__(
            'aws:servicediscovery/instance:Instance',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            service_id: Optional[pulumi.Input[str]] = None) -> 'Instance':
        """
        Get an existing Instance resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] attributes: A map contains the attributes of the instance. Check the [doc](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#API_RegisterInstance_RequestSyntax) for the supported attributes and syntax.
        :param pulumi.Input[str] instance_id: The ID of the service instance.
        :param pulumi.Input[str] service_id: The ID of the service that you want to use to create the instance.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InstanceState.__new__(_InstanceState)

        __props__.__dict__["attributes"] = attributes
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["service_id"] = service_id
        return Instance(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def attributes(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map contains the attributes of the instance. Check the [doc](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#API_RegisterInstance_RequestSyntax) for the supported attributes and syntax.
        """
        return pulumi.get(self, "attributes")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the service instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Output[str]:
        """
        The ID of the service that you want to use to create the instance.
        """
        return pulumi.get(self, "service_id")

