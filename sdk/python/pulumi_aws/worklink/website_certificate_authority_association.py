# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['WebsiteCertificateAuthorityAssociationArgs', 'WebsiteCertificateAuthorityAssociation']

@pulumi.input_type
class WebsiteCertificateAuthorityAssociationArgs:
    def __init__(__self__, *,
                 certificate: pulumi.Input[str],
                 fleet_arn: pulumi.Input[str],
                 display_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a WebsiteCertificateAuthorityAssociation resource.
        :param pulumi.Input[str] certificate: The root certificate of the Certificate Authority.
        :param pulumi.Input[str] fleet_arn: The ARN of the fleet.
        :param pulumi.Input[str] display_name: The certificate name to display.
        """
        pulumi.set(__self__, "certificate", certificate)
        pulumi.set(__self__, "fleet_arn", fleet_arn)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)

    @property
    @pulumi.getter
    def certificate(self) -> pulumi.Input[str]:
        """
        The root certificate of the Certificate Authority.
        """
        return pulumi.get(self, "certificate")

    @certificate.setter
    def certificate(self, value: pulumi.Input[str]):
        pulumi.set(self, "certificate", value)

    @property
    @pulumi.getter(name="fleetArn")
    def fleet_arn(self) -> pulumi.Input[str]:
        """
        The ARN of the fleet.
        """
        return pulumi.get(self, "fleet_arn")

    @fleet_arn.setter
    def fleet_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "fleet_arn", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The certificate name to display.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)


@pulumi.input_type
class _WebsiteCertificateAuthorityAssociationState:
    def __init__(__self__, *,
                 certificate: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 fleet_arn: Optional[pulumi.Input[str]] = None,
                 website_ca_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering WebsiteCertificateAuthorityAssociation resources.
        :param pulumi.Input[str] certificate: The root certificate of the Certificate Authority.
        :param pulumi.Input[str] display_name: The certificate name to display.
        :param pulumi.Input[str] fleet_arn: The ARN of the fleet.
        :param pulumi.Input[str] website_ca_id: A unique identifier for the Certificate Authority.
        """
        if certificate is not None:
            pulumi.set(__self__, "certificate", certificate)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if fleet_arn is not None:
            pulumi.set(__self__, "fleet_arn", fleet_arn)
        if website_ca_id is not None:
            pulumi.set(__self__, "website_ca_id", website_ca_id)

    @property
    @pulumi.getter
    def certificate(self) -> Optional[pulumi.Input[str]]:
        """
        The root certificate of the Certificate Authority.
        """
        return pulumi.get(self, "certificate")

    @certificate.setter
    def certificate(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The certificate name to display.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="fleetArn")
    def fleet_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the fleet.
        """
        return pulumi.get(self, "fleet_arn")

    @fleet_arn.setter
    def fleet_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "fleet_arn", value)

    @property
    @pulumi.getter(name="websiteCaId")
    def website_ca_id(self) -> Optional[pulumi.Input[str]]:
        """
        A unique identifier for the Certificate Authority.
        """
        return pulumi.get(self, "website_ca_id")

    @website_ca_id.setter
    def website_ca_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "website_ca_id", value)


class WebsiteCertificateAuthorityAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 fleet_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws
        import pulumi_std as std

        example = aws.worklink.Fleet("example", name="example")
        test = aws.worklink.WebsiteCertificateAuthorityAssociation("test",
            fleet_arn=test_aws_worklink_fleet["arn"],
            certificate=std.file(input="certificate.pem").result)
        ```

        ## Import

        Using `pulumi import`, import WorkLink Website Certificate Authority using `FLEET-ARN,WEBSITE-CA-ID`. For example:

        ```sh
         $ pulumi import aws:worklink/websiteCertificateAuthorityAssociation:WebsiteCertificateAuthorityAssociation example arn:aws:worklink::123456789012:fleet/example,abcdefghijk
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate: The root certificate of the Certificate Authority.
        :param pulumi.Input[str] display_name: The certificate name to display.
        :param pulumi.Input[str] fleet_arn: The ARN of the fleet.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WebsiteCertificateAuthorityAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws
        import pulumi_std as std

        example = aws.worklink.Fleet("example", name="example")
        test = aws.worklink.WebsiteCertificateAuthorityAssociation("test",
            fleet_arn=test_aws_worklink_fleet["arn"],
            certificate=std.file(input="certificate.pem").result)
        ```

        ## Import

        Using `pulumi import`, import WorkLink Website Certificate Authority using `FLEET-ARN,WEBSITE-CA-ID`. For example:

        ```sh
         $ pulumi import aws:worklink/websiteCertificateAuthorityAssociation:WebsiteCertificateAuthorityAssociation example arn:aws:worklink::123456789012:fleet/example,abcdefghijk
        ```

        :param str resource_name: The name of the resource.
        :param WebsiteCertificateAuthorityAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WebsiteCertificateAuthorityAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 fleet_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WebsiteCertificateAuthorityAssociationArgs.__new__(WebsiteCertificateAuthorityAssociationArgs)

            if certificate is None and not opts.urn:
                raise TypeError("Missing required property 'certificate'")
            __props__.__dict__["certificate"] = certificate
            __props__.__dict__["display_name"] = display_name
            if fleet_arn is None and not opts.urn:
                raise TypeError("Missing required property 'fleet_arn'")
            __props__.__dict__["fleet_arn"] = fleet_arn
            __props__.__dict__["website_ca_id"] = None
        super(WebsiteCertificateAuthorityAssociation, __self__).__init__(
            'aws:worklink/websiteCertificateAuthorityAssociation:WebsiteCertificateAuthorityAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            certificate: Optional[pulumi.Input[str]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            fleet_arn: Optional[pulumi.Input[str]] = None,
            website_ca_id: Optional[pulumi.Input[str]] = None) -> 'WebsiteCertificateAuthorityAssociation':
        """
        Get an existing WebsiteCertificateAuthorityAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate: The root certificate of the Certificate Authority.
        :param pulumi.Input[str] display_name: The certificate name to display.
        :param pulumi.Input[str] fleet_arn: The ARN of the fleet.
        :param pulumi.Input[str] website_ca_id: A unique identifier for the Certificate Authority.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WebsiteCertificateAuthorityAssociationState.__new__(_WebsiteCertificateAuthorityAssociationState)

        __props__.__dict__["certificate"] = certificate
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["fleet_arn"] = fleet_arn
        __props__.__dict__["website_ca_id"] = website_ca_id
        return WebsiteCertificateAuthorityAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def certificate(self) -> pulumi.Output[str]:
        """
        The root certificate of the Certificate Authority.
        """
        return pulumi.get(self, "certificate")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[Optional[str]]:
        """
        The certificate name to display.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="fleetArn")
    def fleet_arn(self) -> pulumi.Output[str]:
        """
        The ARN of the fleet.
        """
        return pulumi.get(self, "fleet_arn")

    @property
    @pulumi.getter(name="websiteCaId")
    def website_ca_id(self) -> pulumi.Output[str]:
        """
        A unique identifier for the Certificate Authority.
        """
        return pulumi.get(self, "website_ca_id")

