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

__all__ = ['FleetArgs', 'Fleet']

@pulumi.input_type
class FleetArgs:
    def __init__(__self__, *,
                 audit_stream_arn: Optional[pulumi.Input[str]] = None,
                 device_ca_certificate: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 identity_provider: Optional[pulumi.Input['FleetIdentityProviderArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network: Optional[pulumi.Input['FleetNetworkArgs']] = None,
                 optimize_for_end_user_location: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a Fleet resource.
        :param pulumi.Input[str] audit_stream_arn: The ARN of the Amazon Kinesis data stream that receives the audit events. Kinesis data stream name must begin with `"AmazonWorkLink-"`.
        :param pulumi.Input[str] device_ca_certificate: The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
        :param pulumi.Input[str] display_name: The name of the fleet.
        :param pulumi.Input['FleetIdentityProviderArgs'] identity_provider: Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
        :param pulumi.Input[str] name: A region-unique name for the AMI.
        :param pulumi.Input['FleetNetworkArgs'] network: Provide this to allow manage the company network configuration for the fleet. Fields documented below.
        :param pulumi.Input[bool] optimize_for_end_user_location: The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
               
               **network** requires the following:
               
               > **NOTE:** `network` is cannot removed without force recreating.
        """
        if audit_stream_arn is not None:
            pulumi.set(__self__, "audit_stream_arn", audit_stream_arn)
        if device_ca_certificate is not None:
            pulumi.set(__self__, "device_ca_certificate", device_ca_certificate)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if identity_provider is not None:
            pulumi.set(__self__, "identity_provider", identity_provider)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if network is not None:
            pulumi.set(__self__, "network", network)
        if optimize_for_end_user_location is not None:
            pulumi.set(__self__, "optimize_for_end_user_location", optimize_for_end_user_location)

    @property
    @pulumi.getter(name="auditStreamArn")
    def audit_stream_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the Amazon Kinesis data stream that receives the audit events. Kinesis data stream name must begin with `"AmazonWorkLink-"`.
        """
        return pulumi.get(self, "audit_stream_arn")

    @audit_stream_arn.setter
    def audit_stream_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "audit_stream_arn", value)

    @property
    @pulumi.getter(name="deviceCaCertificate")
    def device_ca_certificate(self) -> Optional[pulumi.Input[str]]:
        """
        The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
        """
        return pulumi.get(self, "device_ca_certificate")

    @device_ca_certificate.setter
    def device_ca_certificate(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_ca_certificate", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the fleet.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="identityProvider")
    def identity_provider(self) -> Optional[pulumi.Input['FleetIdentityProviderArgs']]:
        """
        Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
        """
        return pulumi.get(self, "identity_provider")

    @identity_provider.setter
    def identity_provider(self, value: Optional[pulumi.Input['FleetIdentityProviderArgs']]):
        pulumi.set(self, "identity_provider", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A region-unique name for the AMI.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def network(self) -> Optional[pulumi.Input['FleetNetworkArgs']]:
        """
        Provide this to allow manage the company network configuration for the fleet. Fields documented below.
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: Optional[pulumi.Input['FleetNetworkArgs']]):
        pulumi.set(self, "network", value)

    @property
    @pulumi.getter(name="optimizeForEndUserLocation")
    def optimize_for_end_user_location(self) -> Optional[pulumi.Input[bool]]:
        """
        The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.

        **network** requires the following:

        > **NOTE:** `network` is cannot removed without force recreating.
        """
        return pulumi.get(self, "optimize_for_end_user_location")

    @optimize_for_end_user_location.setter
    def optimize_for_end_user_location(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "optimize_for_end_user_location", value)


@pulumi.input_type
class _FleetState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 audit_stream_arn: Optional[pulumi.Input[str]] = None,
                 company_code: Optional[pulumi.Input[str]] = None,
                 created_time: Optional[pulumi.Input[str]] = None,
                 device_ca_certificate: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 identity_provider: Optional[pulumi.Input['FleetIdentityProviderArgs']] = None,
                 last_updated_time: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network: Optional[pulumi.Input['FleetNetworkArgs']] = None,
                 optimize_for_end_user_location: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering Fleet resources.
        :param pulumi.Input[str] arn: The ARN of the created WorkLink Fleet.
        :param pulumi.Input[str] audit_stream_arn: The ARN of the Amazon Kinesis data stream that receives the audit events. Kinesis data stream name must begin with `"AmazonWorkLink-"`.
        :param pulumi.Input[str] company_code: The identifier used by users to sign in to the Amazon WorkLink app.
        :param pulumi.Input[str] created_time: The time that the fleet was created.
        :param pulumi.Input[str] device_ca_certificate: The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
        :param pulumi.Input[str] display_name: The name of the fleet.
        :param pulumi.Input['FleetIdentityProviderArgs'] identity_provider: Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
        :param pulumi.Input[str] last_updated_time: The time that the fleet was last updated.
        :param pulumi.Input[str] name: A region-unique name for the AMI.
        :param pulumi.Input['FleetNetworkArgs'] network: Provide this to allow manage the company network configuration for the fleet. Fields documented below.
        :param pulumi.Input[bool] optimize_for_end_user_location: The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
               
               **network** requires the following:
               
               > **NOTE:** `network` is cannot removed without force recreating.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if audit_stream_arn is not None:
            pulumi.set(__self__, "audit_stream_arn", audit_stream_arn)
        if company_code is not None:
            pulumi.set(__self__, "company_code", company_code)
        if created_time is not None:
            pulumi.set(__self__, "created_time", created_time)
        if device_ca_certificate is not None:
            pulumi.set(__self__, "device_ca_certificate", device_ca_certificate)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if identity_provider is not None:
            pulumi.set(__self__, "identity_provider", identity_provider)
        if last_updated_time is not None:
            pulumi.set(__self__, "last_updated_time", last_updated_time)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if network is not None:
            pulumi.set(__self__, "network", network)
        if optimize_for_end_user_location is not None:
            pulumi.set(__self__, "optimize_for_end_user_location", optimize_for_end_user_location)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the created WorkLink Fleet.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="auditStreamArn")
    def audit_stream_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the Amazon Kinesis data stream that receives the audit events. Kinesis data stream name must begin with `"AmazonWorkLink-"`.
        """
        return pulumi.get(self, "audit_stream_arn")

    @audit_stream_arn.setter
    def audit_stream_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "audit_stream_arn", value)

    @property
    @pulumi.getter(name="companyCode")
    def company_code(self) -> Optional[pulumi.Input[str]]:
        """
        The identifier used by users to sign in to the Amazon WorkLink app.
        """
        return pulumi.get(self, "company_code")

    @company_code.setter
    def company_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "company_code", value)

    @property
    @pulumi.getter(name="createdTime")
    def created_time(self) -> Optional[pulumi.Input[str]]:
        """
        The time that the fleet was created.
        """
        return pulumi.get(self, "created_time")

    @created_time.setter
    def created_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_time", value)

    @property
    @pulumi.getter(name="deviceCaCertificate")
    def device_ca_certificate(self) -> Optional[pulumi.Input[str]]:
        """
        The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
        """
        return pulumi.get(self, "device_ca_certificate")

    @device_ca_certificate.setter
    def device_ca_certificate(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_ca_certificate", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the fleet.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="identityProvider")
    def identity_provider(self) -> Optional[pulumi.Input['FleetIdentityProviderArgs']]:
        """
        Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
        """
        return pulumi.get(self, "identity_provider")

    @identity_provider.setter
    def identity_provider(self, value: Optional[pulumi.Input['FleetIdentityProviderArgs']]):
        pulumi.set(self, "identity_provider", value)

    @property
    @pulumi.getter(name="lastUpdatedTime")
    def last_updated_time(self) -> Optional[pulumi.Input[str]]:
        """
        The time that the fleet was last updated.
        """
        return pulumi.get(self, "last_updated_time")

    @last_updated_time.setter
    def last_updated_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_updated_time", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A region-unique name for the AMI.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def network(self) -> Optional[pulumi.Input['FleetNetworkArgs']]:
        """
        Provide this to allow manage the company network configuration for the fleet. Fields documented below.
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: Optional[pulumi.Input['FleetNetworkArgs']]):
        pulumi.set(self, "network", value)

    @property
    @pulumi.getter(name="optimizeForEndUserLocation")
    def optimize_for_end_user_location(self) -> Optional[pulumi.Input[bool]]:
        """
        The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.

        **network** requires the following:

        > **NOTE:** `network` is cannot removed without force recreating.
        """
        return pulumi.get(self, "optimize_for_end_user_location")

    @optimize_for_end_user_location.setter
    def optimize_for_end_user_location(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "optimize_for_end_user_location", value)


class Fleet(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 audit_stream_arn: Optional[pulumi.Input[str]] = None,
                 device_ca_certificate: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 identity_provider: Optional[pulumi.Input[pulumi.InputType['FleetIdentityProviderArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network: Optional[pulumi.Input[pulumi.InputType['FleetNetworkArgs']]] = None,
                 optimize_for_end_user_location: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.worklink.Fleet("example")
        ```

        Network Configuration Usage:

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.worklink.Fleet("example", network=aws.worklink.FleetNetworkArgs(
            vpc_id=aws_vpc["test"]["id"],
            subnet_ids=[[__item["id"] for __item in aws_subnet["test"]]],
            security_group_ids=[aws_security_group["test"]["id"]],
        ))
        ```

        Identity Provider Configuration Usage:

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.worklink.Fleet("test", identity_provider=aws.worklink.FleetIdentityProviderArgs(
            type="SAML",
            saml_metadata=(lambda path: open(path).read())("saml-metadata.xml"),
        ))
        ```

        ## Import

        Using `pulumi import`, import WorkLink using the ARN. For example:

        ```sh
         $ pulumi import aws:worklink/fleet:Fleet test arn:aws:worklink::123456789012:fleet/example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] audit_stream_arn: The ARN of the Amazon Kinesis data stream that receives the audit events. Kinesis data stream name must begin with `"AmazonWorkLink-"`.
        :param pulumi.Input[str] device_ca_certificate: The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
        :param pulumi.Input[str] display_name: The name of the fleet.
        :param pulumi.Input[pulumi.InputType['FleetIdentityProviderArgs']] identity_provider: Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
        :param pulumi.Input[str] name: A region-unique name for the AMI.
        :param pulumi.Input[pulumi.InputType['FleetNetworkArgs']] network: Provide this to allow manage the company network configuration for the fleet. Fields documented below.
        :param pulumi.Input[bool] optimize_for_end_user_location: The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
               
               **network** requires the following:
               
               > **NOTE:** `network` is cannot removed without force recreating.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[FleetArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.worklink.Fleet("example")
        ```

        Network Configuration Usage:

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.worklink.Fleet("example", network=aws.worklink.FleetNetworkArgs(
            vpc_id=aws_vpc["test"]["id"],
            subnet_ids=[[__item["id"] for __item in aws_subnet["test"]]],
            security_group_ids=[aws_security_group["test"]["id"]],
        ))
        ```

        Identity Provider Configuration Usage:

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.worklink.Fleet("test", identity_provider=aws.worklink.FleetIdentityProviderArgs(
            type="SAML",
            saml_metadata=(lambda path: open(path).read())("saml-metadata.xml"),
        ))
        ```

        ## Import

        Using `pulumi import`, import WorkLink using the ARN. For example:

        ```sh
         $ pulumi import aws:worklink/fleet:Fleet test arn:aws:worklink::123456789012:fleet/example
        ```

        :param str resource_name: The name of the resource.
        :param FleetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FleetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 audit_stream_arn: Optional[pulumi.Input[str]] = None,
                 device_ca_certificate: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 identity_provider: Optional[pulumi.Input[pulumi.InputType['FleetIdentityProviderArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network: Optional[pulumi.Input[pulumi.InputType['FleetNetworkArgs']]] = None,
                 optimize_for_end_user_location: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FleetArgs.__new__(FleetArgs)

            __props__.__dict__["audit_stream_arn"] = audit_stream_arn
            __props__.__dict__["device_ca_certificate"] = device_ca_certificate
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["identity_provider"] = identity_provider
            __props__.__dict__["name"] = name
            __props__.__dict__["network"] = network
            __props__.__dict__["optimize_for_end_user_location"] = optimize_for_end_user_location
            __props__.__dict__["arn"] = None
            __props__.__dict__["company_code"] = None
            __props__.__dict__["created_time"] = None
            __props__.__dict__["last_updated_time"] = None
        super(Fleet, __self__).__init__(
            'aws:worklink/fleet:Fleet',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            audit_stream_arn: Optional[pulumi.Input[str]] = None,
            company_code: Optional[pulumi.Input[str]] = None,
            created_time: Optional[pulumi.Input[str]] = None,
            device_ca_certificate: Optional[pulumi.Input[str]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            identity_provider: Optional[pulumi.Input[pulumi.InputType['FleetIdentityProviderArgs']]] = None,
            last_updated_time: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            network: Optional[pulumi.Input[pulumi.InputType['FleetNetworkArgs']]] = None,
            optimize_for_end_user_location: Optional[pulumi.Input[bool]] = None) -> 'Fleet':
        """
        Get an existing Fleet resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the created WorkLink Fleet.
        :param pulumi.Input[str] audit_stream_arn: The ARN of the Amazon Kinesis data stream that receives the audit events. Kinesis data stream name must begin with `"AmazonWorkLink-"`.
        :param pulumi.Input[str] company_code: The identifier used by users to sign in to the Amazon WorkLink app.
        :param pulumi.Input[str] created_time: The time that the fleet was created.
        :param pulumi.Input[str] device_ca_certificate: The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
        :param pulumi.Input[str] display_name: The name of the fleet.
        :param pulumi.Input[pulumi.InputType['FleetIdentityProviderArgs']] identity_provider: Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
        :param pulumi.Input[str] last_updated_time: The time that the fleet was last updated.
        :param pulumi.Input[str] name: A region-unique name for the AMI.
        :param pulumi.Input[pulumi.InputType['FleetNetworkArgs']] network: Provide this to allow manage the company network configuration for the fleet. Fields documented below.
        :param pulumi.Input[bool] optimize_for_end_user_location: The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
               
               **network** requires the following:
               
               > **NOTE:** `network` is cannot removed without force recreating.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FleetState.__new__(_FleetState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["audit_stream_arn"] = audit_stream_arn
        __props__.__dict__["company_code"] = company_code
        __props__.__dict__["created_time"] = created_time
        __props__.__dict__["device_ca_certificate"] = device_ca_certificate
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["identity_provider"] = identity_provider
        __props__.__dict__["last_updated_time"] = last_updated_time
        __props__.__dict__["name"] = name
        __props__.__dict__["network"] = network
        __props__.__dict__["optimize_for_end_user_location"] = optimize_for_end_user_location
        return Fleet(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the created WorkLink Fleet.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="auditStreamArn")
    def audit_stream_arn(self) -> pulumi.Output[Optional[str]]:
        """
        The ARN of the Amazon Kinesis data stream that receives the audit events. Kinesis data stream name must begin with `"AmazonWorkLink-"`.
        """
        return pulumi.get(self, "audit_stream_arn")

    @property
    @pulumi.getter(name="companyCode")
    def company_code(self) -> pulumi.Output[str]:
        """
        The identifier used by users to sign in to the Amazon WorkLink app.
        """
        return pulumi.get(self, "company_code")

    @property
    @pulumi.getter(name="createdTime")
    def created_time(self) -> pulumi.Output[str]:
        """
        The time that the fleet was created.
        """
        return pulumi.get(self, "created_time")

    @property
    @pulumi.getter(name="deviceCaCertificate")
    def device_ca_certificate(self) -> pulumi.Output[Optional[str]]:
        """
        The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
        """
        return pulumi.get(self, "device_ca_certificate")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the fleet.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="identityProvider")
    def identity_provider(self) -> pulumi.Output[Optional['outputs.FleetIdentityProvider']]:
        """
        Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
        """
        return pulumi.get(self, "identity_provider")

    @property
    @pulumi.getter(name="lastUpdatedTime")
    def last_updated_time(self) -> pulumi.Output[str]:
        """
        The time that the fleet was last updated.
        """
        return pulumi.get(self, "last_updated_time")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        A region-unique name for the AMI.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def network(self) -> pulumi.Output[Optional['outputs.FleetNetwork']]:
        """
        Provide this to allow manage the company network configuration for the fleet. Fields documented below.
        """
        return pulumi.get(self, "network")

    @property
    @pulumi.getter(name="optimizeForEndUserLocation")
    def optimize_for_end_user_location(self) -> pulumi.Output[Optional[bool]]:
        """
        The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.

        **network** requires the following:

        > **NOTE:** `network` is cannot removed without force recreating.
        """
        return pulumi.get(self, "optimize_for_end_user_location")

