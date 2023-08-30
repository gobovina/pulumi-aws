# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['MemberAssociationArgs', 'MemberAssociation']

@pulumi.input_type
class MemberAssociationArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a MemberAssociation resource.
        :param pulumi.Input[str] account_id: ID of the account to associate
        """
        pulumi.set(__self__, "account_id", account_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        ID of the account to associate
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)


@pulumi.input_type
class _MemberAssociationState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 delegated_admin_account_id: Optional[pulumi.Input[str]] = None,
                 relationship_status: Optional[pulumi.Input[str]] = None,
                 updated_at: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering MemberAssociation resources.
        :param pulumi.Input[str] account_id: ID of the account to associate
        :param pulumi.Input[str] delegated_admin_account_id: Account ID of the delegated administrator account
        :param pulumi.Input[str] relationship_status: Status of the member relationship
        :param pulumi.Input[str] updated_at: Date and time of the last update of the relationship
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if delegated_admin_account_id is not None:
            pulumi.set(__self__, "delegated_admin_account_id", delegated_admin_account_id)
        if relationship_status is not None:
            pulumi.set(__self__, "relationship_status", relationship_status)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the account to associate
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="delegatedAdminAccountId")
    def delegated_admin_account_id(self) -> Optional[pulumi.Input[str]]:
        """
        Account ID of the delegated administrator account
        """
        return pulumi.get(self, "delegated_admin_account_id")

    @delegated_admin_account_id.setter
    def delegated_admin_account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delegated_admin_account_id", value)

    @property
    @pulumi.getter(name="relationshipStatus")
    def relationship_status(self) -> Optional[pulumi.Input[str]]:
        """
        Status of the member relationship
        """
        return pulumi.get(self, "relationship_status")

    @relationship_status.setter
    def relationship_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "relationship_status", value)

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[str]]:
        """
        Date and time of the last update of the relationship
        """
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated_at", value)


class MemberAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for associating accounts to existing Inspector instances.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.inspector2.MemberAssociation("example", account_id="123456789012")
        ```

        ## Import

        Using `pulumi import`, import Amazon Inspector Member Association using the `account_id`. For example:

        ```sh
         $ pulumi import aws:inspector2/memberAssociation:MemberAssociation example 123456789012
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: ID of the account to associate
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MemberAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for associating accounts to existing Inspector instances.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.inspector2.MemberAssociation("example", account_id="123456789012")
        ```

        ## Import

        Using `pulumi import`, import Amazon Inspector Member Association using the `account_id`. For example:

        ```sh
         $ pulumi import aws:inspector2/memberAssociation:MemberAssociation example 123456789012
        ```

        :param str resource_name: The name of the resource.
        :param MemberAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MemberAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MemberAssociationArgs.__new__(MemberAssociationArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["delegated_admin_account_id"] = None
            __props__.__dict__["relationship_status"] = None
            __props__.__dict__["updated_at"] = None
        super(MemberAssociation, __self__).__init__(
            'aws:inspector2/memberAssociation:MemberAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            delegated_admin_account_id: Optional[pulumi.Input[str]] = None,
            relationship_status: Optional[pulumi.Input[str]] = None,
            updated_at: Optional[pulumi.Input[str]] = None) -> 'MemberAssociation':
        """
        Get an existing MemberAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: ID of the account to associate
        :param pulumi.Input[str] delegated_admin_account_id: Account ID of the delegated administrator account
        :param pulumi.Input[str] relationship_status: Status of the member relationship
        :param pulumi.Input[str] updated_at: Date and time of the last update of the relationship
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MemberAssociationState.__new__(_MemberAssociationState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["delegated_admin_account_id"] = delegated_admin_account_id
        __props__.__dict__["relationship_status"] = relationship_status
        __props__.__dict__["updated_at"] = updated_at
        return MemberAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        ID of the account to associate
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="delegatedAdminAccountId")
    def delegated_admin_account_id(self) -> pulumi.Output[str]:
        """
        Account ID of the delegated administrator account
        """
        return pulumi.get(self, "delegated_admin_account_id")

    @property
    @pulumi.getter(name="relationshipStatus")
    def relationship_status(self) -> pulumi.Output[str]:
        """
        Status of the member relationship
        """
        return pulumi.get(self, "relationship_status")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[str]:
        """
        Date and time of the last update of the relationship
        """
        return pulumi.get(self, "updated_at")

