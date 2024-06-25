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
from . import outputs
from ._inputs import *

__all__ = ['DomainConfigurationArgs', 'DomainConfiguration']

@pulumi.input_type
class DomainConfigurationArgs:
    def __init__(__self__, *,
                 authorizer_config: Optional[pulumi.Input['DomainConfigurationAuthorizerConfigArgs']] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 server_certificate_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 service_type: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tls_config: Optional[pulumi.Input['DomainConfigurationTlsConfigArgs']] = None,
                 validation_certificate_arn: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DomainConfiguration resource.
        :param pulumi.Input['DomainConfigurationAuthorizerConfigArgs'] authorizer_config: An object that specifies the authorization service for a domain. See the `authorizer_config` Block below for details.
        :param pulumi.Input[str] domain_name: Fully-qualified domain name.
        :param pulumi.Input[str] name: The name of the domain configuration. This value must be unique to a region.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] server_certificate_arns: The ARNs of the certificates that IoT passes to the device during the TLS handshake. Currently you can specify only one certificate ARN. This value is not required for Amazon Web Services-managed domains. When using a custom `domain_name`, the cert must include it.
        :param pulumi.Input[str] service_type: The type of service delivered by the endpoint. Note: Amazon Web Services IoT Core currently supports only the `DATA` service type.
        :param pulumi.Input[str] status: The status to which the domain configuration should be set. Valid values are `ENABLED` and `DISABLED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input['DomainConfigurationTlsConfigArgs'] tls_config: An object that specifies the TLS configuration for a domain. See the `tls_config` Block below for details.
        :param pulumi.Input[str] validation_certificate_arn: The certificate used to validate the server certificate and prove domain name ownership. This certificate must be signed by a public certificate authority. This value is not required for Amazon Web Services-managed domains.
        """
        if authorizer_config is not None:
            pulumi.set(__self__, "authorizer_config", authorizer_config)
        if domain_name is not None:
            pulumi.set(__self__, "domain_name", domain_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if server_certificate_arns is not None:
            pulumi.set(__self__, "server_certificate_arns", server_certificate_arns)
        if service_type is not None:
            pulumi.set(__self__, "service_type", service_type)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tls_config is not None:
            pulumi.set(__self__, "tls_config", tls_config)
        if validation_certificate_arn is not None:
            pulumi.set(__self__, "validation_certificate_arn", validation_certificate_arn)

    @property
    @pulumi.getter(name="authorizerConfig")
    def authorizer_config(self) -> Optional[pulumi.Input['DomainConfigurationAuthorizerConfigArgs']]:
        """
        An object that specifies the authorization service for a domain. See the `authorizer_config` Block below for details.
        """
        return pulumi.get(self, "authorizer_config")

    @authorizer_config.setter
    def authorizer_config(self, value: Optional[pulumi.Input['DomainConfigurationAuthorizerConfigArgs']]):
        pulumi.set(self, "authorizer_config", value)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> Optional[pulumi.Input[str]]:
        """
        Fully-qualified domain name.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the domain configuration. This value must be unique to a region.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="serverCertificateArns")
    def server_certificate_arns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The ARNs of the certificates that IoT passes to the device during the TLS handshake. Currently you can specify only one certificate ARN. This value is not required for Amazon Web Services-managed domains. When using a custom `domain_name`, the cert must include it.
        """
        return pulumi.get(self, "server_certificate_arns")

    @server_certificate_arns.setter
    def server_certificate_arns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "server_certificate_arns", value)

    @property
    @pulumi.getter(name="serviceType")
    def service_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of service delivered by the endpoint. Note: Amazon Web Services IoT Core currently supports only the `DATA` service type.
        """
        return pulumi.get(self, "service_type")

    @service_type.setter
    def service_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_type", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status to which the domain configuration should be set. Valid values are `ENABLED` and `DISABLED`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tlsConfig")
    def tls_config(self) -> Optional[pulumi.Input['DomainConfigurationTlsConfigArgs']]:
        """
        An object that specifies the TLS configuration for a domain. See the `tls_config` Block below for details.
        """
        return pulumi.get(self, "tls_config")

    @tls_config.setter
    def tls_config(self, value: Optional[pulumi.Input['DomainConfigurationTlsConfigArgs']]):
        pulumi.set(self, "tls_config", value)

    @property
    @pulumi.getter(name="validationCertificateArn")
    def validation_certificate_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The certificate used to validate the server certificate and prove domain name ownership. This certificate must be signed by a public certificate authority. This value is not required for Amazon Web Services-managed domains.
        """
        return pulumi.get(self, "validation_certificate_arn")

    @validation_certificate_arn.setter
    def validation_certificate_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "validation_certificate_arn", value)


@pulumi.input_type
class _DomainConfigurationState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 authorizer_config: Optional[pulumi.Input['DomainConfigurationAuthorizerConfigArgs']] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 domain_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 server_certificate_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 service_type: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tls_config: Optional[pulumi.Input['DomainConfigurationTlsConfigArgs']] = None,
                 validation_certificate_arn: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DomainConfiguration resources.
        :param pulumi.Input[str] arn: The ARN of the domain configuration.
        :param pulumi.Input['DomainConfigurationAuthorizerConfigArgs'] authorizer_config: An object that specifies the authorization service for a domain. See the `authorizer_config` Block below for details.
        :param pulumi.Input[str] domain_name: Fully-qualified domain name.
        :param pulumi.Input[str] domain_type: The type of the domain.
        :param pulumi.Input[str] name: The name of the domain configuration. This value must be unique to a region.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] server_certificate_arns: The ARNs of the certificates that IoT passes to the device during the TLS handshake. Currently you can specify only one certificate ARN. This value is not required for Amazon Web Services-managed domains. When using a custom `domain_name`, the cert must include it.
        :param pulumi.Input[str] service_type: The type of service delivered by the endpoint. Note: Amazon Web Services IoT Core currently supports only the `DATA` service type.
        :param pulumi.Input[str] status: The status to which the domain configuration should be set. Valid values are `ENABLED` and `DISABLED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input['DomainConfigurationTlsConfigArgs'] tls_config: An object that specifies the TLS configuration for a domain. See the `tls_config` Block below for details.
        :param pulumi.Input[str] validation_certificate_arn: The certificate used to validate the server certificate and prove domain name ownership. This certificate must be signed by a public certificate authority. This value is not required for Amazon Web Services-managed domains.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if authorizer_config is not None:
            pulumi.set(__self__, "authorizer_config", authorizer_config)
        if domain_name is not None:
            pulumi.set(__self__, "domain_name", domain_name)
        if domain_type is not None:
            pulumi.set(__self__, "domain_type", domain_type)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if server_certificate_arns is not None:
            pulumi.set(__self__, "server_certificate_arns", server_certificate_arns)
        if service_type is not None:
            pulumi.set(__self__, "service_type", service_type)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if tls_config is not None:
            pulumi.set(__self__, "tls_config", tls_config)
        if validation_certificate_arn is not None:
            pulumi.set(__self__, "validation_certificate_arn", validation_certificate_arn)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the domain configuration.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="authorizerConfig")
    def authorizer_config(self) -> Optional[pulumi.Input['DomainConfigurationAuthorizerConfigArgs']]:
        """
        An object that specifies the authorization service for a domain. See the `authorizer_config` Block below for details.
        """
        return pulumi.get(self, "authorizer_config")

    @authorizer_config.setter
    def authorizer_config(self, value: Optional[pulumi.Input['DomainConfigurationAuthorizerConfigArgs']]):
        pulumi.set(self, "authorizer_config", value)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> Optional[pulumi.Input[str]]:
        """
        Fully-qualified domain name.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter(name="domainType")
    def domain_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the domain.
        """
        return pulumi.get(self, "domain_type")

    @domain_type.setter
    def domain_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the domain configuration. This value must be unique to a region.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="serverCertificateArns")
    def server_certificate_arns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The ARNs of the certificates that IoT passes to the device during the TLS handshake. Currently you can specify only one certificate ARN. This value is not required for Amazon Web Services-managed domains. When using a custom `domain_name`, the cert must include it.
        """
        return pulumi.get(self, "server_certificate_arns")

    @server_certificate_arns.setter
    def server_certificate_arns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "server_certificate_arns", value)

    @property
    @pulumi.getter(name="serviceType")
    def service_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of service delivered by the endpoint. Note: Amazon Web Services IoT Core currently supports only the `DATA` service type.
        """
        return pulumi.get(self, "service_type")

    @service_type.setter
    def service_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_type", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status to which the domain configuration should be set. Valid values are `ENABLED` and `DISABLED`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter(name="tlsConfig")
    def tls_config(self) -> Optional[pulumi.Input['DomainConfigurationTlsConfigArgs']]:
        """
        An object that specifies the TLS configuration for a domain. See the `tls_config` Block below for details.
        """
        return pulumi.get(self, "tls_config")

    @tls_config.setter
    def tls_config(self, value: Optional[pulumi.Input['DomainConfigurationTlsConfigArgs']]):
        pulumi.set(self, "tls_config", value)

    @property
    @pulumi.getter(name="validationCertificateArn")
    def validation_certificate_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The certificate used to validate the server certificate and prove domain name ownership. This certificate must be signed by a public certificate authority. This value is not required for Amazon Web Services-managed domains.
        """
        return pulumi.get(self, "validation_certificate_arn")

    @validation_certificate_arn.setter
    def validation_certificate_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "validation_certificate_arn", value)


class DomainConfiguration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authorizer_config: Optional[pulumi.Input[Union['DomainConfigurationAuthorizerConfigArgs', 'DomainConfigurationAuthorizerConfigArgsDict']]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 server_certificate_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 service_type: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tls_config: Optional[pulumi.Input[Union['DomainConfigurationTlsConfigArgs', 'DomainConfigurationTlsConfigArgsDict']]] = None,
                 validation_certificate_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates and manages an AWS IoT domain configuration.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        iot = aws.iot.DomainConfiguration("iot",
            name="iot-",
            domain_name="iot.example.com",
            service_type="DATA",
            server_certificate_arns=[cert["arn"]])
        ```

        ## Import

        Using `pulumi import`, import domain configurations using the name. For example:

        ```sh
        $ pulumi import aws:iot/domainConfiguration:DomainConfiguration example example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['DomainConfigurationAuthorizerConfigArgs', 'DomainConfigurationAuthorizerConfigArgsDict']] authorizer_config: An object that specifies the authorization service for a domain. See the `authorizer_config` Block below for details.
        :param pulumi.Input[str] domain_name: Fully-qualified domain name.
        :param pulumi.Input[str] name: The name of the domain configuration. This value must be unique to a region.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] server_certificate_arns: The ARNs of the certificates that IoT passes to the device during the TLS handshake. Currently you can specify only one certificate ARN. This value is not required for Amazon Web Services-managed domains. When using a custom `domain_name`, the cert must include it.
        :param pulumi.Input[str] service_type: The type of service delivered by the endpoint. Note: Amazon Web Services IoT Core currently supports only the `DATA` service type.
        :param pulumi.Input[str] status: The status to which the domain configuration should be set. Valid values are `ENABLED` and `DISABLED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Union['DomainConfigurationTlsConfigArgs', 'DomainConfigurationTlsConfigArgsDict']] tls_config: An object that specifies the TLS configuration for a domain. See the `tls_config` Block below for details.
        :param pulumi.Input[str] validation_certificate_arn: The certificate used to validate the server certificate and prove domain name ownership. This certificate must be signed by a public certificate authority. This value is not required for Amazon Web Services-managed domains.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[DomainConfigurationArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates and manages an AWS IoT domain configuration.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        iot = aws.iot.DomainConfiguration("iot",
            name="iot-",
            domain_name="iot.example.com",
            service_type="DATA",
            server_certificate_arns=[cert["arn"]])
        ```

        ## Import

        Using `pulumi import`, import domain configurations using the name. For example:

        ```sh
        $ pulumi import aws:iot/domainConfiguration:DomainConfiguration example example
        ```

        :param str resource_name: The name of the resource.
        :param DomainConfigurationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DomainConfigurationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authorizer_config: Optional[pulumi.Input[Union['DomainConfigurationAuthorizerConfigArgs', 'DomainConfigurationAuthorizerConfigArgsDict']]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 server_certificate_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 service_type: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tls_config: Optional[pulumi.Input[Union['DomainConfigurationTlsConfigArgs', 'DomainConfigurationTlsConfigArgsDict']]] = None,
                 validation_certificate_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DomainConfigurationArgs.__new__(DomainConfigurationArgs)

            __props__.__dict__["authorizer_config"] = authorizer_config
            __props__.__dict__["domain_name"] = domain_name
            __props__.__dict__["name"] = name
            __props__.__dict__["server_certificate_arns"] = server_certificate_arns
            __props__.__dict__["service_type"] = service_type
            __props__.__dict__["status"] = status
            __props__.__dict__["tags"] = tags
            __props__.__dict__["tls_config"] = tls_config
            __props__.__dict__["validation_certificate_arn"] = validation_certificate_arn
            __props__.__dict__["arn"] = None
            __props__.__dict__["domain_type"] = None
            __props__.__dict__["tags_all"] = None
        super(DomainConfiguration, __self__).__init__(
            'aws:iot/domainConfiguration:DomainConfiguration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            authorizer_config: Optional[pulumi.Input[Union['DomainConfigurationAuthorizerConfigArgs', 'DomainConfigurationAuthorizerConfigArgsDict']]] = None,
            domain_name: Optional[pulumi.Input[str]] = None,
            domain_type: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            server_certificate_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            service_type: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tls_config: Optional[pulumi.Input[Union['DomainConfigurationTlsConfigArgs', 'DomainConfigurationTlsConfigArgsDict']]] = None,
            validation_certificate_arn: Optional[pulumi.Input[str]] = None) -> 'DomainConfiguration':
        """
        Get an existing DomainConfiguration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the domain configuration.
        :param pulumi.Input[Union['DomainConfigurationAuthorizerConfigArgs', 'DomainConfigurationAuthorizerConfigArgsDict']] authorizer_config: An object that specifies the authorization service for a domain. See the `authorizer_config` Block below for details.
        :param pulumi.Input[str] domain_name: Fully-qualified domain name.
        :param pulumi.Input[str] domain_type: The type of the domain.
        :param pulumi.Input[str] name: The name of the domain configuration. This value must be unique to a region.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] server_certificate_arns: The ARNs of the certificates that IoT passes to the device during the TLS handshake. Currently you can specify only one certificate ARN. This value is not required for Amazon Web Services-managed domains. When using a custom `domain_name`, the cert must include it.
        :param pulumi.Input[str] service_type: The type of service delivered by the endpoint. Note: Amazon Web Services IoT Core currently supports only the `DATA` service type.
        :param pulumi.Input[str] status: The status to which the domain configuration should be set. Valid values are `ENABLED` and `DISABLED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[Union['DomainConfigurationTlsConfigArgs', 'DomainConfigurationTlsConfigArgsDict']] tls_config: An object that specifies the TLS configuration for a domain. See the `tls_config` Block below for details.
        :param pulumi.Input[str] validation_certificate_arn: The certificate used to validate the server certificate and prove domain name ownership. This certificate must be signed by a public certificate authority. This value is not required for Amazon Web Services-managed domains.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DomainConfigurationState.__new__(_DomainConfigurationState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["authorizer_config"] = authorizer_config
        __props__.__dict__["domain_name"] = domain_name
        __props__.__dict__["domain_type"] = domain_type
        __props__.__dict__["name"] = name
        __props__.__dict__["server_certificate_arns"] = server_certificate_arns
        __props__.__dict__["service_type"] = service_type
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["tls_config"] = tls_config
        __props__.__dict__["validation_certificate_arn"] = validation_certificate_arn
        return DomainConfiguration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the domain configuration.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="authorizerConfig")
    def authorizer_config(self) -> pulumi.Output[Optional['outputs.DomainConfigurationAuthorizerConfig']]:
        """
        An object that specifies the authorization service for a domain. See the `authorizer_config` Block below for details.
        """
        return pulumi.get(self, "authorizer_config")

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Output[Optional[str]]:
        """
        Fully-qualified domain name.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter(name="domainType")
    def domain_type(self) -> pulumi.Output[str]:
        """
        The type of the domain.
        """
        return pulumi.get(self, "domain_type")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the domain configuration. This value must be unique to a region.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="serverCertificateArns")
    def server_certificate_arns(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The ARNs of the certificates that IoT passes to the device during the TLS handshake. Currently you can specify only one certificate ARN. This value is not required for Amazon Web Services-managed domains. When using a custom `domain_name`, the cert must include it.
        """
        return pulumi.get(self, "server_certificate_arns")

    @property
    @pulumi.getter(name="serviceType")
    def service_type(self) -> pulumi.Output[Optional[str]]:
        """
        The type of service delivered by the endpoint. Note: Amazon Web Services IoT Core currently supports only the `DATA` service type.
        """
        return pulumi.get(self, "service_type")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[Optional[str]]:
        """
        The status to which the domain configuration should be set. Valid values are `ENABLED` and `DISABLED`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter(name="tlsConfig")
    def tls_config(self) -> pulumi.Output['outputs.DomainConfigurationTlsConfig']:
        """
        An object that specifies the TLS configuration for a domain. See the `tls_config` Block below for details.
        """
        return pulumi.get(self, "tls_config")

    @property
    @pulumi.getter(name="validationCertificateArn")
    def validation_certificate_arn(self) -> pulumi.Output[Optional[str]]:
        """
        The certificate used to validate the server certificate and prove domain name ownership. This certificate must be signed by a public certificate authority. This value is not required for Amazon Web Services-managed domains.
        """
        return pulumi.get(self, "validation_certificate_arn")

