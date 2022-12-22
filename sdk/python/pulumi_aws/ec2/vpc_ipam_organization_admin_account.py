# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['VpcIpamOrganizationAdminAccountArgs', 'VpcIpamOrganizationAdminAccount']

@pulumi.input_type
class VpcIpamOrganizationAdminAccountArgs:
    def __init__(__self__, *,
                 delegated_admin_account_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a VpcIpamOrganizationAdminAccount resource.
        """
        pulumi.set(__self__, "delegated_admin_account_id", delegated_admin_account_id)

    @property
    @pulumi.getter(name="delegatedAdminAccountId")
    def delegated_admin_account_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "delegated_admin_account_id")

    @delegated_admin_account_id.setter
    def delegated_admin_account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "delegated_admin_account_id", value)


@pulumi.input_type
class _VpcIpamOrganizationAdminAccountState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 delegated_admin_account_id: Optional[pulumi.Input[str]] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 service_principal: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering VpcIpamOrganizationAdminAccount resources.
        :param pulumi.Input[str] arn: The Organizations ARN for the delegate account.
        :param pulumi.Input[str] email: The Organizations email for the delegate account.
        :param pulumi.Input[str] name: The Organizations name for the delegate account.
        :param pulumi.Input[str] service_principal: The AWS service principal.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if delegated_admin_account_id is not None:
            pulumi.set(__self__, "delegated_admin_account_id", delegated_admin_account_id)
        if email is not None:
            pulumi.set(__self__, "email", email)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if service_principal is not None:
            pulumi.set(__self__, "service_principal", service_principal)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Organizations ARN for the delegate account.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="delegatedAdminAccountId")
    def delegated_admin_account_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "delegated_admin_account_id")

    @delegated_admin_account_id.setter
    def delegated_admin_account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delegated_admin_account_id", value)

    @property
    @pulumi.getter
    def email(self) -> Optional[pulumi.Input[str]]:
        """
        The Organizations email for the delegate account.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The Organizations name for the delegate account.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="servicePrincipal")
    def service_principal(self) -> Optional[pulumi.Input[str]]:
        """
        The AWS service principal.
        """
        return pulumi.get(self, "service_principal")

    @service_principal.setter
    def service_principal(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_principal", value)


class VpcIpamOrganizationAdminAccount(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delegated_admin_account_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Enables the IPAM Service and promotes a delegated administrator.

        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_aws as aws

        delegated = aws.get_caller_identity()
        example = aws.ec2.VpcIpamOrganizationAdminAccount("example", delegated_admin_account_id=delegated.account_id)
        ipam_delegate_account = aws.Provider("ipamDelegateAccount")
        # authentication arguments omitted
        ```

        ## Import

        IPAMs can be imported using the `delegate account id`, e.g.

        ```sh
         $ pulumi import aws:ec2/vpcIpamOrganizationAdminAccount:VpcIpamOrganizationAdminAccount example 12345678901
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VpcIpamOrganizationAdminAccountArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Enables the IPAM Service and promotes a delegated administrator.

        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_aws as aws

        delegated = aws.get_caller_identity()
        example = aws.ec2.VpcIpamOrganizationAdminAccount("example", delegated_admin_account_id=delegated.account_id)
        ipam_delegate_account = aws.Provider("ipamDelegateAccount")
        # authentication arguments omitted
        ```

        ## Import

        IPAMs can be imported using the `delegate account id`, e.g.

        ```sh
         $ pulumi import aws:ec2/vpcIpamOrganizationAdminAccount:VpcIpamOrganizationAdminAccount example 12345678901
        ```

        :param str resource_name: The name of the resource.
        :param VpcIpamOrganizationAdminAccountArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VpcIpamOrganizationAdminAccountArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delegated_admin_account_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VpcIpamOrganizationAdminAccountArgs.__new__(VpcIpamOrganizationAdminAccountArgs)

            if delegated_admin_account_id is None and not opts.urn:
                raise TypeError("Missing required property 'delegated_admin_account_id'")
            __props__.__dict__["delegated_admin_account_id"] = delegated_admin_account_id
            __props__.__dict__["arn"] = None
            __props__.__dict__["email"] = None
            __props__.__dict__["name"] = None
            __props__.__dict__["service_principal"] = None
        super(VpcIpamOrganizationAdminAccount, __self__).__init__(
            'aws:ec2/vpcIpamOrganizationAdminAccount:VpcIpamOrganizationAdminAccount',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            delegated_admin_account_id: Optional[pulumi.Input[str]] = None,
            email: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            service_principal: Optional[pulumi.Input[str]] = None) -> 'VpcIpamOrganizationAdminAccount':
        """
        Get an existing VpcIpamOrganizationAdminAccount resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Organizations ARN for the delegate account.
        :param pulumi.Input[str] email: The Organizations email for the delegate account.
        :param pulumi.Input[str] name: The Organizations name for the delegate account.
        :param pulumi.Input[str] service_principal: The AWS service principal.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VpcIpamOrganizationAdminAccountState.__new__(_VpcIpamOrganizationAdminAccountState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["delegated_admin_account_id"] = delegated_admin_account_id
        __props__.__dict__["email"] = email
        __props__.__dict__["name"] = name
        __props__.__dict__["service_principal"] = service_principal
        return VpcIpamOrganizationAdminAccount(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Organizations ARN for the delegate account.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="delegatedAdminAccountId")
    def delegated_admin_account_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "delegated_admin_account_id")

    @property
    @pulumi.getter
    def email(self) -> pulumi.Output[str]:
        """
        The Organizations email for the delegate account.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The Organizations name for the delegate account.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="servicePrincipal")
    def service_principal(self) -> pulumi.Output[str]:
        """
        The AWS service principal.
        """
        return pulumi.get(self, "service_principal")

