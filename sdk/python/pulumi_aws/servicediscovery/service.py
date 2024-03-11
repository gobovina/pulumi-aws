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

__all__ = ['ServiceArgs', 'Service']

@pulumi.input_type
class ServiceArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 dns_config: Optional[pulumi.Input['ServiceDnsConfigArgs']] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 health_check_config: Optional[pulumi.Input['ServiceHealthCheckConfigArgs']] = None,
                 health_check_custom_config: Optional[pulumi.Input['ServiceHealthCheckCustomConfigArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Service resource.
        :param pulumi.Input[str] description: The description of the service.
        :param pulumi.Input['ServiceDnsConfigArgs'] dns_config: A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
        :param pulumi.Input[bool] force_destroy: A boolean that indicates all instances should be deleted from the service so that the service can be destroyed without error. These instances are not recoverable.
        :param pulumi.Input['ServiceHealthCheckConfigArgs'] health_check_config: A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
        :param pulumi.Input['ServiceHealthCheckCustomConfigArgs'] health_check_custom_config: A complex type that contains settings for ECS managed health checks.
        :param pulumi.Input[str] name: The name of the service.
        :param pulumi.Input[str] namespace_id: The ID of the namespace that you want to use to create the service.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] type: If present, specifies that the service instances are only discoverable using the `DiscoverInstances` API operation. No DNS records is registered for the service instances. The only valid value is `HTTP`.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if dns_config is not None:
            pulumi.set(__self__, "dns_config", dns_config)
        if force_destroy is not None:
            pulumi.set(__self__, "force_destroy", force_destroy)
        if health_check_config is not None:
            pulumi.set(__self__, "health_check_config", health_check_config)
        if health_check_custom_config is not None:
            pulumi.set(__self__, "health_check_custom_config", health_check_custom_config)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace_id is not None:
            pulumi.set(__self__, "namespace_id", namespace_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the service.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="dnsConfig")
    def dns_config(self) -> Optional[pulumi.Input['ServiceDnsConfigArgs']]:
        """
        A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
        """
        return pulumi.get(self, "dns_config")

    @dns_config.setter
    def dns_config(self, value: Optional[pulumi.Input['ServiceDnsConfigArgs']]):
        pulumi.set(self, "dns_config", value)

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> Optional[pulumi.Input[bool]]:
        """
        A boolean that indicates all instances should be deleted from the service so that the service can be destroyed without error. These instances are not recoverable.
        """
        return pulumi.get(self, "force_destroy")

    @force_destroy.setter
    def force_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force_destroy", value)

    @property
    @pulumi.getter(name="healthCheckConfig")
    def health_check_config(self) -> Optional[pulumi.Input['ServiceHealthCheckConfigArgs']]:
        """
        A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
        """
        return pulumi.get(self, "health_check_config")

    @health_check_config.setter
    def health_check_config(self, value: Optional[pulumi.Input['ServiceHealthCheckConfigArgs']]):
        pulumi.set(self, "health_check_config", value)

    @property
    @pulumi.getter(name="healthCheckCustomConfig")
    def health_check_custom_config(self) -> Optional[pulumi.Input['ServiceHealthCheckCustomConfigArgs']]:
        """
        A complex type that contains settings for ECS managed health checks.
        """
        return pulumi.get(self, "health_check_custom_config")

    @health_check_custom_config.setter
    def health_check_custom_config(self, value: Optional[pulumi.Input['ServiceHealthCheckCustomConfigArgs']]):
        pulumi.set(self, "health_check_custom_config", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the service.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the namespace that you want to use to create the service.
        """
        return pulumi.get(self, "namespace_id")

    @namespace_id.setter
    def namespace_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        If present, specifies that the service instances are only discoverable using the `DiscoverInstances` API operation. No DNS records is registered for the service instances. The only valid value is `HTTP`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _ServiceState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 dns_config: Optional[pulumi.Input['ServiceDnsConfigArgs']] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 health_check_config: Optional[pulumi.Input['ServiceHealthCheckConfigArgs']] = None,
                 health_check_custom_config: Optional[pulumi.Input['ServiceHealthCheckCustomConfigArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Service resources.
        :param pulumi.Input[str] arn: The ARN of the service.
        :param pulumi.Input[str] description: The description of the service.
        :param pulumi.Input['ServiceDnsConfigArgs'] dns_config: A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
        :param pulumi.Input[bool] force_destroy: A boolean that indicates all instances should be deleted from the service so that the service can be destroyed without error. These instances are not recoverable.
        :param pulumi.Input['ServiceHealthCheckConfigArgs'] health_check_config: A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
        :param pulumi.Input['ServiceHealthCheckCustomConfigArgs'] health_check_custom_config: A complex type that contains settings for ECS managed health checks.
        :param pulumi.Input[str] name: The name of the service.
        :param pulumi.Input[str] namespace_id: The ID of the namespace that you want to use to create the service.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] type: If present, specifies that the service instances are only discoverable using the `DiscoverInstances` API operation. No DNS records is registered for the service instances. The only valid value is `HTTP`.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if dns_config is not None:
            pulumi.set(__self__, "dns_config", dns_config)
        if force_destroy is not None:
            pulumi.set(__self__, "force_destroy", force_destroy)
        if health_check_config is not None:
            pulumi.set(__self__, "health_check_config", health_check_config)
        if health_check_custom_config is not None:
            pulumi.set(__self__, "health_check_custom_config", health_check_custom_config)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace_id is not None:
            pulumi.set(__self__, "namespace_id", namespace_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the service.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the service.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="dnsConfig")
    def dns_config(self) -> Optional[pulumi.Input['ServiceDnsConfigArgs']]:
        """
        A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
        """
        return pulumi.get(self, "dns_config")

    @dns_config.setter
    def dns_config(self, value: Optional[pulumi.Input['ServiceDnsConfigArgs']]):
        pulumi.set(self, "dns_config", value)

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> Optional[pulumi.Input[bool]]:
        """
        A boolean that indicates all instances should be deleted from the service so that the service can be destroyed without error. These instances are not recoverable.
        """
        return pulumi.get(self, "force_destroy")

    @force_destroy.setter
    def force_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force_destroy", value)

    @property
    @pulumi.getter(name="healthCheckConfig")
    def health_check_config(self) -> Optional[pulumi.Input['ServiceHealthCheckConfigArgs']]:
        """
        A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
        """
        return pulumi.get(self, "health_check_config")

    @health_check_config.setter
    def health_check_config(self, value: Optional[pulumi.Input['ServiceHealthCheckConfigArgs']]):
        pulumi.set(self, "health_check_config", value)

    @property
    @pulumi.getter(name="healthCheckCustomConfig")
    def health_check_custom_config(self) -> Optional[pulumi.Input['ServiceHealthCheckCustomConfigArgs']]:
        """
        A complex type that contains settings for ECS managed health checks.
        """
        return pulumi.get(self, "health_check_custom_config")

    @health_check_custom_config.setter
    def health_check_custom_config(self, value: Optional[pulumi.Input['ServiceHealthCheckCustomConfigArgs']]):
        pulumi.set(self, "health_check_custom_config", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the service.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the namespace that you want to use to create the service.
        """
        return pulumi.get(self, "namespace_id")

    @namespace_id.setter
    def namespace_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        If present, specifies that the service instances are only discoverable using the `DiscoverInstances` API operation. No DNS records is registered for the service instances. The only valid value is `HTTP`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class Service(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 dns_config: Optional[pulumi.Input[pulumi.InputType['ServiceDnsConfigArgs']]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 health_check_config: Optional[pulumi.Input[pulumi.InputType['ServiceHealthCheckConfigArgs']]] = None,
                 health_check_custom_config: Optional[pulumi.Input[pulumi.InputType['ServiceHealthCheckCustomConfigArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Service Discovery Service resource.

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
            name="example.mydomain.local",
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
        ```
        <!--End PulumiCodeChooser -->

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.servicediscovery.PublicDnsNamespace("example",
            name="example.mydomain.com",
            description="example")
        example_service = aws.servicediscovery.Service("example",
            name="example",
            dns_config=aws.servicediscovery.ServiceDnsConfigArgs(
                namespace_id=example.id,
                dns_records=[aws.servicediscovery.ServiceDnsConfigDnsRecordArgs(
                    ttl=10,
                    type="A",
                )],
            ),
            health_check_config=aws.servicediscovery.ServiceHealthCheckConfigArgs(
                failure_threshold=10,
                resource_path="path",
                type="HTTP",
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Service Discovery Service using the service ID. For example:

        ```sh
        $ pulumi import aws:servicediscovery/service:Service example 0123456789
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the service.
        :param pulumi.Input[pulumi.InputType['ServiceDnsConfigArgs']] dns_config: A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
        :param pulumi.Input[bool] force_destroy: A boolean that indicates all instances should be deleted from the service so that the service can be destroyed without error. These instances are not recoverable.
        :param pulumi.Input[pulumi.InputType['ServiceHealthCheckConfigArgs']] health_check_config: A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
        :param pulumi.Input[pulumi.InputType['ServiceHealthCheckCustomConfigArgs']] health_check_custom_config: A complex type that contains settings for ECS managed health checks.
        :param pulumi.Input[str] name: The name of the service.
        :param pulumi.Input[str] namespace_id: The ID of the namespace that you want to use to create the service.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] type: If present, specifies that the service instances are only discoverable using the `DiscoverInstances` API operation. No DNS records is registered for the service instances. The only valid value is `HTTP`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ServiceArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Service Discovery Service resource.

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
            name="example.mydomain.local",
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
        ```
        <!--End PulumiCodeChooser -->

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.servicediscovery.PublicDnsNamespace("example",
            name="example.mydomain.com",
            description="example")
        example_service = aws.servicediscovery.Service("example",
            name="example",
            dns_config=aws.servicediscovery.ServiceDnsConfigArgs(
                namespace_id=example.id,
                dns_records=[aws.servicediscovery.ServiceDnsConfigDnsRecordArgs(
                    ttl=10,
                    type="A",
                )],
            ),
            health_check_config=aws.servicediscovery.ServiceHealthCheckConfigArgs(
                failure_threshold=10,
                resource_path="path",
                type="HTTP",
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Service Discovery Service using the service ID. For example:

        ```sh
        $ pulumi import aws:servicediscovery/service:Service example 0123456789
        ```

        :param str resource_name: The name of the resource.
        :param ServiceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 dns_config: Optional[pulumi.Input[pulumi.InputType['ServiceDnsConfigArgs']]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 health_check_config: Optional[pulumi.Input[pulumi.InputType['ServiceHealthCheckConfigArgs']]] = None,
                 health_check_custom_config: Optional[pulumi.Input[pulumi.InputType['ServiceHealthCheckCustomConfigArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceArgs.__new__(ServiceArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["dns_config"] = dns_config
            __props__.__dict__["force_destroy"] = force_destroy
            __props__.__dict__["health_check_config"] = health_check_config
            __props__.__dict__["health_check_custom_config"] = health_check_custom_config
            __props__.__dict__["name"] = name
            __props__.__dict__["namespace_id"] = namespace_id
            __props__.__dict__["tags"] = tags
            __props__.__dict__["type"] = type
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(Service, __self__).__init__(
            'aws:servicediscovery/service:Service',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            dns_config: Optional[pulumi.Input[pulumi.InputType['ServiceDnsConfigArgs']]] = None,
            force_destroy: Optional[pulumi.Input[bool]] = None,
            health_check_config: Optional[pulumi.Input[pulumi.InputType['ServiceHealthCheckConfigArgs']]] = None,
            health_check_custom_config: Optional[pulumi.Input[pulumi.InputType['ServiceHealthCheckCustomConfigArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            namespace_id: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'Service':
        """
        Get an existing Service resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the service.
        :param pulumi.Input[str] description: The description of the service.
        :param pulumi.Input[pulumi.InputType['ServiceDnsConfigArgs']] dns_config: A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
        :param pulumi.Input[bool] force_destroy: A boolean that indicates all instances should be deleted from the service so that the service can be destroyed without error. These instances are not recoverable.
        :param pulumi.Input[pulumi.InputType['ServiceHealthCheckConfigArgs']] health_check_config: A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
        :param pulumi.Input[pulumi.InputType['ServiceHealthCheckCustomConfigArgs']] health_check_custom_config: A complex type that contains settings for ECS managed health checks.
        :param pulumi.Input[str] name: The name of the service.
        :param pulumi.Input[str] namespace_id: The ID of the namespace that you want to use to create the service.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] type: If present, specifies that the service instances are only discoverable using the `DiscoverInstances` API operation. No DNS records is registered for the service instances. The only valid value is `HTTP`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceState.__new__(_ServiceState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["description"] = description
        __props__.__dict__["dns_config"] = dns_config
        __props__.__dict__["force_destroy"] = force_destroy
        __props__.__dict__["health_check_config"] = health_check_config
        __props__.__dict__["health_check_custom_config"] = health_check_custom_config
        __props__.__dict__["name"] = name
        __props__.__dict__["namespace_id"] = namespace_id
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["type"] = type
        return Service(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the service.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the service.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="dnsConfig")
    def dns_config(self) -> pulumi.Output[Optional['outputs.ServiceDnsConfig']]:
        """
        A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
        """
        return pulumi.get(self, "dns_config")

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> pulumi.Output[Optional[bool]]:
        """
        A boolean that indicates all instances should be deleted from the service so that the service can be destroyed without error. These instances are not recoverable.
        """
        return pulumi.get(self, "force_destroy")

    @property
    @pulumi.getter(name="healthCheckConfig")
    def health_check_config(self) -> pulumi.Output[Optional['outputs.ServiceHealthCheckConfig']]:
        """
        A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
        """
        return pulumi.get(self, "health_check_config")

    @property
    @pulumi.getter(name="healthCheckCustomConfig")
    def health_check_custom_config(self) -> pulumi.Output[Optional['outputs.ServiceHealthCheckCustomConfig']]:
        """
        A complex type that contains settings for ECS managed health checks.
        """
        return pulumi.get(self, "health_check_custom_config")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the service.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> pulumi.Output[str]:
        """
        The ID of the namespace that you want to use to create the service.
        """
        return pulumi.get(self, "namespace_id")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        If present, specifies that the service instances are only discoverable using the `DiscoverInstances` API operation. No DNS records is registered for the service instances. The only valid value is `HTTP`.
        """
        return pulumi.get(self, "type")

