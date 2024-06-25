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

__all__ = ['CustomDomainAssociationArgs', 'CustomDomainAssociation']

@pulumi.input_type
class CustomDomainAssociationArgs:
    def __init__(__self__, *,
                 domain_name: pulumi.Input[str],
                 service_arn: pulumi.Input[str],
                 enable_www_subdomain: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a CustomDomainAssociation resource.
        :param pulumi.Input[str] domain_name: Custom domain endpoint to association. Specify a base domain e.g., `example.com` or a subdomain e.g., `subdomain.example.com`.
        :param pulumi.Input[str] service_arn: ARN of the App Runner service.
        :param pulumi.Input[bool] enable_www_subdomain: Whether to associate the subdomain with the App Runner service in addition to the base domain. Defaults to `true`.
        """
        pulumi.set(__self__, "domain_name", domain_name)
        pulumi.set(__self__, "service_arn", service_arn)
        if enable_www_subdomain is not None:
            pulumi.set(__self__, "enable_www_subdomain", enable_www_subdomain)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Input[str]:
        """
        Custom domain endpoint to association. Specify a base domain e.g., `example.com` or a subdomain e.g., `subdomain.example.com`.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter(name="serviceArn")
    def service_arn(self) -> pulumi.Input[str]:
        """
        ARN of the App Runner service.
        """
        return pulumi.get(self, "service_arn")

    @service_arn.setter
    def service_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_arn", value)

    @property
    @pulumi.getter(name="enableWwwSubdomain")
    def enable_www_subdomain(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to associate the subdomain with the App Runner service in addition to the base domain. Defaults to `true`.
        """
        return pulumi.get(self, "enable_www_subdomain")

    @enable_www_subdomain.setter
    def enable_www_subdomain(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_www_subdomain", value)


@pulumi.input_type
class _CustomDomainAssociationState:
    def __init__(__self__, *,
                 certificate_validation_records: Optional[pulumi.Input[Sequence[pulumi.Input['CustomDomainAssociationCertificateValidationRecordArgs']]]] = None,
                 dns_target: Optional[pulumi.Input[str]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 enable_www_subdomain: Optional[pulumi.Input[bool]] = None,
                 service_arn: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CustomDomainAssociation resources.
        :param pulumi.Input[Sequence[pulumi.Input['CustomDomainAssociationCertificateValidationRecordArgs']]] certificate_validation_records: A set of certificate CNAME records used for this domain name. See Certificate Validation Records below for more details.
        :param pulumi.Input[str] dns_target: App Runner subdomain of the App Runner service. The custom domain name is mapped to this target name. Attribute only available if resource created (not imported) with this provider.
        :param pulumi.Input[str] domain_name: Custom domain endpoint to association. Specify a base domain e.g., `example.com` or a subdomain e.g., `subdomain.example.com`.
        :param pulumi.Input[bool] enable_www_subdomain: Whether to associate the subdomain with the App Runner service in addition to the base domain. Defaults to `true`.
        :param pulumi.Input[str] service_arn: ARN of the App Runner service.
        :param pulumi.Input[str] status: Current state of the certificate CNAME record validation. It should change to `SUCCESS` after App Runner completes validation with your DNS.
        """
        if certificate_validation_records is not None:
            pulumi.set(__self__, "certificate_validation_records", certificate_validation_records)
        if dns_target is not None:
            pulumi.set(__self__, "dns_target", dns_target)
        if domain_name is not None:
            pulumi.set(__self__, "domain_name", domain_name)
        if enable_www_subdomain is not None:
            pulumi.set(__self__, "enable_www_subdomain", enable_www_subdomain)
        if service_arn is not None:
            pulumi.set(__self__, "service_arn", service_arn)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="certificateValidationRecords")
    def certificate_validation_records(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CustomDomainAssociationCertificateValidationRecordArgs']]]]:
        """
        A set of certificate CNAME records used for this domain name. See Certificate Validation Records below for more details.
        """
        return pulumi.get(self, "certificate_validation_records")

    @certificate_validation_records.setter
    def certificate_validation_records(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CustomDomainAssociationCertificateValidationRecordArgs']]]]):
        pulumi.set(self, "certificate_validation_records", value)

    @property
    @pulumi.getter(name="dnsTarget")
    def dns_target(self) -> Optional[pulumi.Input[str]]:
        """
        App Runner subdomain of the App Runner service. The custom domain name is mapped to this target name. Attribute only available if resource created (not imported) with this provider.
        """
        return pulumi.get(self, "dns_target")

    @dns_target.setter
    def dns_target(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dns_target", value)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> Optional[pulumi.Input[str]]:
        """
        Custom domain endpoint to association. Specify a base domain e.g., `example.com` or a subdomain e.g., `subdomain.example.com`.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter(name="enableWwwSubdomain")
    def enable_www_subdomain(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to associate the subdomain with the App Runner service in addition to the base domain. Defaults to `true`.
        """
        return pulumi.get(self, "enable_www_subdomain")

    @enable_www_subdomain.setter
    def enable_www_subdomain(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_www_subdomain", value)

    @property
    @pulumi.getter(name="serviceArn")
    def service_arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the App Runner service.
        """
        return pulumi.get(self, "service_arn")

    @service_arn.setter
    def service_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_arn", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Current state of the certificate CNAME record validation. It should change to `SUCCESS` after App Runner completes validation with your DNS.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class CustomDomainAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 enable_www_subdomain: Optional[pulumi.Input[bool]] = None,
                 service_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an App Runner Custom Domain association.

        > **NOTE:** After creation, you must use the information in the `certification_validation_records` attribute to add CNAME records to your Domain Name System (DNS). For each mapped domain name, add a mapping to the target App Runner subdomain (found in the `dns_target` attribute) and one or more certificate validation records. App Runner then performs DNS validation to verify that you own or control the domain name you associated. App Runner tracks domain validity in a certificate stored in AWS Certificate Manager (ACM).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.apprunner.CustomDomainAssociation("example",
            domain_name="example.com",
            service_arn=example_aws_apprunner_service["arn"])
        ```

        ## Import

        Using `pulumi import`, import App Runner Custom Domain Associations using the `domain_name` and `service_arn` separated by a comma (`,`). For example:

        ```sh
        $ pulumi import aws:apprunner/customDomainAssociation:CustomDomainAssociation example example.com,arn:aws:apprunner:us-east-1:123456789012:service/example-app/8fe1e10304f84fd2b0df550fe98a71fa
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain_name: Custom domain endpoint to association. Specify a base domain e.g., `example.com` or a subdomain e.g., `subdomain.example.com`.
        :param pulumi.Input[bool] enable_www_subdomain: Whether to associate the subdomain with the App Runner service in addition to the base domain. Defaults to `true`.
        :param pulumi.Input[str] service_arn: ARN of the App Runner service.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CustomDomainAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an App Runner Custom Domain association.

        > **NOTE:** After creation, you must use the information in the `certification_validation_records` attribute to add CNAME records to your Domain Name System (DNS). For each mapped domain name, add a mapping to the target App Runner subdomain (found in the `dns_target` attribute) and one or more certificate validation records. App Runner then performs DNS validation to verify that you own or control the domain name you associated. App Runner tracks domain validity in a certificate stored in AWS Certificate Manager (ACM).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.apprunner.CustomDomainAssociation("example",
            domain_name="example.com",
            service_arn=example_aws_apprunner_service["arn"])
        ```

        ## Import

        Using `pulumi import`, import App Runner Custom Domain Associations using the `domain_name` and `service_arn` separated by a comma (`,`). For example:

        ```sh
        $ pulumi import aws:apprunner/customDomainAssociation:CustomDomainAssociation example example.com,arn:aws:apprunner:us-east-1:123456789012:service/example-app/8fe1e10304f84fd2b0df550fe98a71fa
        ```

        :param str resource_name: The name of the resource.
        :param CustomDomainAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CustomDomainAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 enable_www_subdomain: Optional[pulumi.Input[bool]] = None,
                 service_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CustomDomainAssociationArgs.__new__(CustomDomainAssociationArgs)

            if domain_name is None and not opts.urn:
                raise TypeError("Missing required property 'domain_name'")
            __props__.__dict__["domain_name"] = domain_name
            __props__.__dict__["enable_www_subdomain"] = enable_www_subdomain
            if service_arn is None and not opts.urn:
                raise TypeError("Missing required property 'service_arn'")
            __props__.__dict__["service_arn"] = service_arn
            __props__.__dict__["certificate_validation_records"] = None
            __props__.__dict__["dns_target"] = None
            __props__.__dict__["status"] = None
        super(CustomDomainAssociation, __self__).__init__(
            'aws:apprunner/customDomainAssociation:CustomDomainAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            certificate_validation_records: Optional[pulumi.Input[Sequence[pulumi.Input[Union['CustomDomainAssociationCertificateValidationRecordArgs', 'CustomDomainAssociationCertificateValidationRecordArgsDict']]]]] = None,
            dns_target: Optional[pulumi.Input[str]] = None,
            domain_name: Optional[pulumi.Input[str]] = None,
            enable_www_subdomain: Optional[pulumi.Input[bool]] = None,
            service_arn: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'CustomDomainAssociation':
        """
        Get an existing CustomDomainAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['CustomDomainAssociationCertificateValidationRecordArgs', 'CustomDomainAssociationCertificateValidationRecordArgsDict']]]] certificate_validation_records: A set of certificate CNAME records used for this domain name. See Certificate Validation Records below for more details.
        :param pulumi.Input[str] dns_target: App Runner subdomain of the App Runner service. The custom domain name is mapped to this target name. Attribute only available if resource created (not imported) with this provider.
        :param pulumi.Input[str] domain_name: Custom domain endpoint to association. Specify a base domain e.g., `example.com` or a subdomain e.g., `subdomain.example.com`.
        :param pulumi.Input[bool] enable_www_subdomain: Whether to associate the subdomain with the App Runner service in addition to the base domain. Defaults to `true`.
        :param pulumi.Input[str] service_arn: ARN of the App Runner service.
        :param pulumi.Input[str] status: Current state of the certificate CNAME record validation. It should change to `SUCCESS` after App Runner completes validation with your DNS.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CustomDomainAssociationState.__new__(_CustomDomainAssociationState)

        __props__.__dict__["certificate_validation_records"] = certificate_validation_records
        __props__.__dict__["dns_target"] = dns_target
        __props__.__dict__["domain_name"] = domain_name
        __props__.__dict__["enable_www_subdomain"] = enable_www_subdomain
        __props__.__dict__["service_arn"] = service_arn
        __props__.__dict__["status"] = status
        return CustomDomainAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="certificateValidationRecords")
    def certificate_validation_records(self) -> pulumi.Output[Sequence['outputs.CustomDomainAssociationCertificateValidationRecord']]:
        """
        A set of certificate CNAME records used for this domain name. See Certificate Validation Records below for more details.
        """
        return pulumi.get(self, "certificate_validation_records")

    @property
    @pulumi.getter(name="dnsTarget")
    def dns_target(self) -> pulumi.Output[str]:
        """
        App Runner subdomain of the App Runner service. The custom domain name is mapped to this target name. Attribute only available if resource created (not imported) with this provider.
        """
        return pulumi.get(self, "dns_target")

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Output[str]:
        """
        Custom domain endpoint to association. Specify a base domain e.g., `example.com` or a subdomain e.g., `subdomain.example.com`.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter(name="enableWwwSubdomain")
    def enable_www_subdomain(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether to associate the subdomain with the App Runner service in addition to the base domain. Defaults to `true`.
        """
        return pulumi.get(self, "enable_www_subdomain")

    @property
    @pulumi.getter(name="serviceArn")
    def service_arn(self) -> pulumi.Output[str]:
        """
        ARN of the App Runner service.
        """
        return pulumi.get(self, "service_arn")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Current state of the certificate CNAME record validation. It should change to `SUCCESS` after App Runner completes validation with your DNS.
        """
        return pulumi.get(self, "status")

