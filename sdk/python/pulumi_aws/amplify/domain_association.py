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

__all__ = ['DomainAssociationArgs', 'DomainAssociation']

@pulumi.input_type
class DomainAssociationArgs:
    def __init__(__self__, *,
                 app_id: pulumi.Input[str],
                 domain_name: pulumi.Input[str],
                 sub_domains: pulumi.Input[Sequence[pulumi.Input['DomainAssociationSubDomainArgs']]],
                 enable_auto_sub_domain: Optional[pulumi.Input[bool]] = None,
                 wait_for_verification: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a DomainAssociation resource.
        :param pulumi.Input[str] app_id: Unique ID for an Amplify app.
        :param pulumi.Input[str] domain_name: Domain name for the domain association.
        :param pulumi.Input[Sequence[pulumi.Input['DomainAssociationSubDomainArgs']]] sub_domains: Setting for the subdomain. Documented below.
        :param pulumi.Input[bool] enable_auto_sub_domain: Enables the automated creation of subdomains for branches.
        :param pulumi.Input[bool] wait_for_verification: If enabled, the resource will wait for the domain association status to change to `PENDING_DEPLOYMENT` or `AVAILABLE`. Setting this to `false` will skip the process. Default: `true`.
        """
        pulumi.set(__self__, "app_id", app_id)
        pulumi.set(__self__, "domain_name", domain_name)
        pulumi.set(__self__, "sub_domains", sub_domains)
        if enable_auto_sub_domain is not None:
            pulumi.set(__self__, "enable_auto_sub_domain", enable_auto_sub_domain)
        if wait_for_verification is not None:
            pulumi.set(__self__, "wait_for_verification", wait_for_verification)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> pulumi.Input[str]:
        """
        Unique ID for an Amplify app.
        """
        return pulumi.get(self, "app_id")

    @app_id.setter
    def app_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "app_id", value)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Input[str]:
        """
        Domain name for the domain association.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter(name="subDomains")
    def sub_domains(self) -> pulumi.Input[Sequence[pulumi.Input['DomainAssociationSubDomainArgs']]]:
        """
        Setting for the subdomain. Documented below.
        """
        return pulumi.get(self, "sub_domains")

    @sub_domains.setter
    def sub_domains(self, value: pulumi.Input[Sequence[pulumi.Input['DomainAssociationSubDomainArgs']]]):
        pulumi.set(self, "sub_domains", value)

    @property
    @pulumi.getter(name="enableAutoSubDomain")
    def enable_auto_sub_domain(self) -> Optional[pulumi.Input[bool]]:
        """
        Enables the automated creation of subdomains for branches.
        """
        return pulumi.get(self, "enable_auto_sub_domain")

    @enable_auto_sub_domain.setter
    def enable_auto_sub_domain(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_auto_sub_domain", value)

    @property
    @pulumi.getter(name="waitForVerification")
    def wait_for_verification(self) -> Optional[pulumi.Input[bool]]:
        """
        If enabled, the resource will wait for the domain association status to change to `PENDING_DEPLOYMENT` or `AVAILABLE`. Setting this to `false` will skip the process. Default: `true`.
        """
        return pulumi.get(self, "wait_for_verification")

    @wait_for_verification.setter
    def wait_for_verification(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "wait_for_verification", value)


@pulumi.input_type
class _DomainAssociationState:
    def __init__(__self__, *,
                 app_id: Optional[pulumi.Input[str]] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 certificate_verification_dns_record: Optional[pulumi.Input[str]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 enable_auto_sub_domain: Optional[pulumi.Input[bool]] = None,
                 sub_domains: Optional[pulumi.Input[Sequence[pulumi.Input['DomainAssociationSubDomainArgs']]]] = None,
                 wait_for_verification: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering DomainAssociation resources.
        :param pulumi.Input[str] app_id: Unique ID for an Amplify app.
        :param pulumi.Input[str] arn: ARN for the domain association.
        :param pulumi.Input[str] certificate_verification_dns_record: The DNS record for certificate verification.
        :param pulumi.Input[str] domain_name: Domain name for the domain association.
        :param pulumi.Input[bool] enable_auto_sub_domain: Enables the automated creation of subdomains for branches.
        :param pulumi.Input[Sequence[pulumi.Input['DomainAssociationSubDomainArgs']]] sub_domains: Setting for the subdomain. Documented below.
        :param pulumi.Input[bool] wait_for_verification: If enabled, the resource will wait for the domain association status to change to `PENDING_DEPLOYMENT` or `AVAILABLE`. Setting this to `false` will skip the process. Default: `true`.
        """
        if app_id is not None:
            pulumi.set(__self__, "app_id", app_id)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if certificate_verification_dns_record is not None:
            pulumi.set(__self__, "certificate_verification_dns_record", certificate_verification_dns_record)
        if domain_name is not None:
            pulumi.set(__self__, "domain_name", domain_name)
        if enable_auto_sub_domain is not None:
            pulumi.set(__self__, "enable_auto_sub_domain", enable_auto_sub_domain)
        if sub_domains is not None:
            pulumi.set(__self__, "sub_domains", sub_domains)
        if wait_for_verification is not None:
            pulumi.set(__self__, "wait_for_verification", wait_for_verification)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique ID for an Amplify app.
        """
        return pulumi.get(self, "app_id")

    @app_id.setter
    def app_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "app_id", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN for the domain association.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="certificateVerificationDnsRecord")
    def certificate_verification_dns_record(self) -> Optional[pulumi.Input[str]]:
        """
        The DNS record for certificate verification.
        """
        return pulumi.get(self, "certificate_verification_dns_record")

    @certificate_verification_dns_record.setter
    def certificate_verification_dns_record(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_verification_dns_record", value)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> Optional[pulumi.Input[str]]:
        """
        Domain name for the domain association.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter(name="enableAutoSubDomain")
    def enable_auto_sub_domain(self) -> Optional[pulumi.Input[bool]]:
        """
        Enables the automated creation of subdomains for branches.
        """
        return pulumi.get(self, "enable_auto_sub_domain")

    @enable_auto_sub_domain.setter
    def enable_auto_sub_domain(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_auto_sub_domain", value)

    @property
    @pulumi.getter(name="subDomains")
    def sub_domains(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DomainAssociationSubDomainArgs']]]]:
        """
        Setting for the subdomain. Documented below.
        """
        return pulumi.get(self, "sub_domains")

    @sub_domains.setter
    def sub_domains(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DomainAssociationSubDomainArgs']]]]):
        pulumi.set(self, "sub_domains", value)

    @property
    @pulumi.getter(name="waitForVerification")
    def wait_for_verification(self) -> Optional[pulumi.Input[bool]]:
        """
        If enabled, the resource will wait for the domain association status to change to `PENDING_DEPLOYMENT` or `AVAILABLE`. Setting this to `false` will skip the process. Default: `true`.
        """
        return pulumi.get(self, "wait_for_verification")

    @wait_for_verification.setter
    def wait_for_verification(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "wait_for_verification", value)


class DomainAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_id: Optional[pulumi.Input[str]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 enable_auto_sub_domain: Optional[pulumi.Input[bool]] = None,
                 sub_domains: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DomainAssociationSubDomainArgs']]]]] = None,
                 wait_for_verification: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Provides an Amplify Domain Association resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example_app = aws.amplify.App("exampleApp", custom_rules=[aws.amplify.AppCustomRuleArgs(
            source="https://example.com",
            status="302",
            target="https://www.example.com",
        )])
        master = aws.amplify.Branch("master",
            app_id=example_app.id,
            branch_name="master")
        example_domain_association = aws.amplify.DomainAssociation("exampleDomainAssociation",
            app_id=example_app.id,
            domain_name="example.com",
            sub_domains=[
                aws.amplify.DomainAssociationSubDomainArgs(
                    branch_name=master.branch_name,
                    prefix="",
                ),
                aws.amplify.DomainAssociationSubDomainArgs(
                    branch_name=master.branch_name,
                    prefix="www",
                ),
            ])
        ```

        ## Import

        Using `pulumi import`, import Amplify domain association using `app_id` and `domain_name`. For example:

        ```sh
         $ pulumi import aws:amplify/domainAssociation:DomainAssociation app d2ypk4k47z8u6/example.com
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] app_id: Unique ID for an Amplify app.
        :param pulumi.Input[str] domain_name: Domain name for the domain association.
        :param pulumi.Input[bool] enable_auto_sub_domain: Enables the automated creation of subdomains for branches.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DomainAssociationSubDomainArgs']]]] sub_domains: Setting for the subdomain. Documented below.
        :param pulumi.Input[bool] wait_for_verification: If enabled, the resource will wait for the domain association status to change to `PENDING_DEPLOYMENT` or `AVAILABLE`. Setting this to `false` will skip the process. Default: `true`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DomainAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an Amplify Domain Association resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example_app = aws.amplify.App("exampleApp", custom_rules=[aws.amplify.AppCustomRuleArgs(
            source="https://example.com",
            status="302",
            target="https://www.example.com",
        )])
        master = aws.amplify.Branch("master",
            app_id=example_app.id,
            branch_name="master")
        example_domain_association = aws.amplify.DomainAssociation("exampleDomainAssociation",
            app_id=example_app.id,
            domain_name="example.com",
            sub_domains=[
                aws.amplify.DomainAssociationSubDomainArgs(
                    branch_name=master.branch_name,
                    prefix="",
                ),
                aws.amplify.DomainAssociationSubDomainArgs(
                    branch_name=master.branch_name,
                    prefix="www",
                ),
            ])
        ```

        ## Import

        Using `pulumi import`, import Amplify domain association using `app_id` and `domain_name`. For example:

        ```sh
         $ pulumi import aws:amplify/domainAssociation:DomainAssociation app d2ypk4k47z8u6/example.com
        ```

        :param str resource_name: The name of the resource.
        :param DomainAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DomainAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_id: Optional[pulumi.Input[str]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 enable_auto_sub_domain: Optional[pulumi.Input[bool]] = None,
                 sub_domains: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DomainAssociationSubDomainArgs']]]]] = None,
                 wait_for_verification: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DomainAssociationArgs.__new__(DomainAssociationArgs)

            if app_id is None and not opts.urn:
                raise TypeError("Missing required property 'app_id'")
            __props__.__dict__["app_id"] = app_id
            if domain_name is None and not opts.urn:
                raise TypeError("Missing required property 'domain_name'")
            __props__.__dict__["domain_name"] = domain_name
            __props__.__dict__["enable_auto_sub_domain"] = enable_auto_sub_domain
            if sub_domains is None and not opts.urn:
                raise TypeError("Missing required property 'sub_domains'")
            __props__.__dict__["sub_domains"] = sub_domains
            __props__.__dict__["wait_for_verification"] = wait_for_verification
            __props__.__dict__["arn"] = None
            __props__.__dict__["certificate_verification_dns_record"] = None
        super(DomainAssociation, __self__).__init__(
            'aws:amplify/domainAssociation:DomainAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            app_id: Optional[pulumi.Input[str]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            certificate_verification_dns_record: Optional[pulumi.Input[str]] = None,
            domain_name: Optional[pulumi.Input[str]] = None,
            enable_auto_sub_domain: Optional[pulumi.Input[bool]] = None,
            sub_domains: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DomainAssociationSubDomainArgs']]]]] = None,
            wait_for_verification: Optional[pulumi.Input[bool]] = None) -> 'DomainAssociation':
        """
        Get an existing DomainAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] app_id: Unique ID for an Amplify app.
        :param pulumi.Input[str] arn: ARN for the domain association.
        :param pulumi.Input[str] certificate_verification_dns_record: The DNS record for certificate verification.
        :param pulumi.Input[str] domain_name: Domain name for the domain association.
        :param pulumi.Input[bool] enable_auto_sub_domain: Enables the automated creation of subdomains for branches.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DomainAssociationSubDomainArgs']]]] sub_domains: Setting for the subdomain. Documented below.
        :param pulumi.Input[bool] wait_for_verification: If enabled, the resource will wait for the domain association status to change to `PENDING_DEPLOYMENT` or `AVAILABLE`. Setting this to `false` will skip the process. Default: `true`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DomainAssociationState.__new__(_DomainAssociationState)

        __props__.__dict__["app_id"] = app_id
        __props__.__dict__["arn"] = arn
        __props__.__dict__["certificate_verification_dns_record"] = certificate_verification_dns_record
        __props__.__dict__["domain_name"] = domain_name
        __props__.__dict__["enable_auto_sub_domain"] = enable_auto_sub_domain
        __props__.__dict__["sub_domains"] = sub_domains
        __props__.__dict__["wait_for_verification"] = wait_for_verification
        return DomainAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> pulumi.Output[str]:
        """
        Unique ID for an Amplify app.
        """
        return pulumi.get(self, "app_id")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN for the domain association.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="certificateVerificationDnsRecord")
    def certificate_verification_dns_record(self) -> pulumi.Output[str]:
        """
        The DNS record for certificate verification.
        """
        return pulumi.get(self, "certificate_verification_dns_record")

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Output[str]:
        """
        Domain name for the domain association.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter(name="enableAutoSubDomain")
    def enable_auto_sub_domain(self) -> pulumi.Output[Optional[bool]]:
        """
        Enables the automated creation of subdomains for branches.
        """
        return pulumi.get(self, "enable_auto_sub_domain")

    @property
    @pulumi.getter(name="subDomains")
    def sub_domains(self) -> pulumi.Output[Sequence['outputs.DomainAssociationSubDomain']]:
        """
        Setting for the subdomain. Documented below.
        """
        return pulumi.get(self, "sub_domains")

    @property
    @pulumi.getter(name="waitForVerification")
    def wait_for_verification(self) -> pulumi.Output[Optional[bool]]:
        """
        If enabled, the resource will wait for the domain association status to change to `PENDING_DEPLOYMENT` or `AVAILABLE`. Setting this to `false` will skip the process. Default: `true`.
        """
        return pulumi.get(self, "wait_for_verification")

