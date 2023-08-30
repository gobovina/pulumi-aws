# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['MemberArgs', 'Member']

@pulumi.input_type
class MemberArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 email: pulumi.Input[str],
                 invitation_disable_email_notification: Optional[pulumi.Input[bool]] = None,
                 invitation_message: Optional[pulumi.Input[str]] = None,
                 invite: Optional[pulumi.Input[bool]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Member resource.
        :param pulumi.Input[str] account_id: The AWS account ID for the account.
        :param pulumi.Input[str] email: The email address for the account.
        :param pulumi.Input[bool] invitation_disable_email_notification: Specifies whether to send an email notification to the root user of each account that the invitation will be sent to. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. To send an email notification to the root user of each account, set this value to `true`.
        :param pulumi.Input[str] invitation_message: A custom message to include in the invitation. Amazon Macie adds this message to the standard content that it sends for an invitation.
        :param pulumi.Input[bool] invite: Send an invitation to a member
        :param pulumi.Input[str] status: Specifies the status for the account. To enable Amazon Macie and start all Macie activities for the account, set this value to `ENABLED`. Valid values are `ENABLED` or `PAUSED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "email", email)
        if invitation_disable_email_notification is not None:
            pulumi.set(__self__, "invitation_disable_email_notification", invitation_disable_email_notification)
        if invitation_message is not None:
            pulumi.set(__self__, "invitation_message", invitation_message)
        if invite is not None:
            pulumi.set(__self__, "invite", invite)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        The AWS account ID for the account.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def email(self) -> pulumi.Input[str]:
        """
        The email address for the account.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: pulumi.Input[str]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter(name="invitationDisableEmailNotification")
    def invitation_disable_email_notification(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to send an email notification to the root user of each account that the invitation will be sent to. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. To send an email notification to the root user of each account, set this value to `true`.
        """
        return pulumi.get(self, "invitation_disable_email_notification")

    @invitation_disable_email_notification.setter
    def invitation_disable_email_notification(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "invitation_disable_email_notification", value)

    @property
    @pulumi.getter(name="invitationMessage")
    def invitation_message(self) -> Optional[pulumi.Input[str]]:
        """
        A custom message to include in the invitation. Amazon Macie adds this message to the standard content that it sends for an invitation.
        """
        return pulumi.get(self, "invitation_message")

    @invitation_message.setter
    def invitation_message(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "invitation_message", value)

    @property
    @pulumi.getter
    def invite(self) -> Optional[pulumi.Input[bool]]:
        """
        Send an invitation to a member
        """
        return pulumi.get(self, "invite")

    @invite.setter
    def invite(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "invite", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the status for the account. To enable Amazon Macie and start all Macie activities for the account, set this value to `ENABLED`. Valid values are `ENABLED` or `PAUSED`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _MemberState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 administrator_account_id: Optional[pulumi.Input[str]] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 invitation_disable_email_notification: Optional[pulumi.Input[bool]] = None,
                 invitation_message: Optional[pulumi.Input[str]] = None,
                 invite: Optional[pulumi.Input[bool]] = None,
                 invited_at: Optional[pulumi.Input[str]] = None,
                 master_account_id: Optional[pulumi.Input[str]] = None,
                 relationship_status: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 updated_at: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Member resources.
        :param pulumi.Input[str] account_id: The AWS account ID for the account.
        :param pulumi.Input[str] administrator_account_id: The AWS account ID for the administrator account.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the account.
        :param pulumi.Input[str] email: The email address for the account.
        :param pulumi.Input[bool] invitation_disable_email_notification: Specifies whether to send an email notification to the root user of each account that the invitation will be sent to. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. To send an email notification to the root user of each account, set this value to `true`.
        :param pulumi.Input[str] invitation_message: A custom message to include in the invitation. Amazon Macie adds this message to the standard content that it sends for an invitation.
        :param pulumi.Input[bool] invite: Send an invitation to a member
        :param pulumi.Input[str] invited_at: The date and time, in UTC and extended RFC 3339 format, when an Amazon Macie membership invitation was last sent to the account. This value is null if a Macie invitation hasn't been sent to the account.
        :param pulumi.Input[str] relationship_status: The current status of the relationship between the account and the administrator account.
        :param pulumi.Input[str] status: Specifies the status for the account. To enable Amazon Macie and start all Macie activities for the account, set this value to `ENABLED`. Valid values are `ENABLED` or `PAUSED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie.
        :param pulumi.Input[str] updated_at: The date and time, in UTC and extended RFC 3339 format, of the most recent change to the status of the relationship between the account and the administrator account.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if administrator_account_id is not None:
            pulumi.set(__self__, "administrator_account_id", administrator_account_id)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if email is not None:
            pulumi.set(__self__, "email", email)
        if invitation_disable_email_notification is not None:
            pulumi.set(__self__, "invitation_disable_email_notification", invitation_disable_email_notification)
        if invitation_message is not None:
            pulumi.set(__self__, "invitation_message", invitation_message)
        if invite is not None:
            pulumi.set(__self__, "invite", invite)
        if invited_at is not None:
            pulumi.set(__self__, "invited_at", invited_at)
        if master_account_id is not None:
            pulumi.set(__self__, "master_account_id", master_account_id)
        if relationship_status is not None:
            pulumi.set(__self__, "relationship_status", relationship_status)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The AWS account ID for the account.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="administratorAccountId")
    def administrator_account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The AWS account ID for the administrator account.
        """
        return pulumi.get(self, "administrator_account_id")

    @administrator_account_id.setter
    def administrator_account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "administrator_account_id", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the account.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def email(self) -> Optional[pulumi.Input[str]]:
        """
        The email address for the account.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter(name="invitationDisableEmailNotification")
    def invitation_disable_email_notification(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to send an email notification to the root user of each account that the invitation will be sent to. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. To send an email notification to the root user of each account, set this value to `true`.
        """
        return pulumi.get(self, "invitation_disable_email_notification")

    @invitation_disable_email_notification.setter
    def invitation_disable_email_notification(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "invitation_disable_email_notification", value)

    @property
    @pulumi.getter(name="invitationMessage")
    def invitation_message(self) -> Optional[pulumi.Input[str]]:
        """
        A custom message to include in the invitation. Amazon Macie adds this message to the standard content that it sends for an invitation.
        """
        return pulumi.get(self, "invitation_message")

    @invitation_message.setter
    def invitation_message(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "invitation_message", value)

    @property
    @pulumi.getter
    def invite(self) -> Optional[pulumi.Input[bool]]:
        """
        Send an invitation to a member
        """
        return pulumi.get(self, "invite")

    @invite.setter
    def invite(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "invite", value)

    @property
    @pulumi.getter(name="invitedAt")
    def invited_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time, in UTC and extended RFC 3339 format, when an Amazon Macie membership invitation was last sent to the account. This value is null if a Macie invitation hasn't been sent to the account.
        """
        return pulumi.get(self, "invited_at")

    @invited_at.setter
    def invited_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "invited_at", value)

    @property
    @pulumi.getter(name="masterAccountId")
    def master_account_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "master_account_id")

    @master_account_id.setter
    def master_account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "master_account_id", value)

    @property
    @pulumi.getter(name="relationshipStatus")
    def relationship_status(self) -> Optional[pulumi.Input[str]]:
        """
        The current status of the relationship between the account and the administrator account.
        """
        return pulumi.get(self, "relationship_status")

    @relationship_status.setter
    def relationship_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "relationship_status", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the status for the account. To enable Amazon Macie and start all Macie activities for the account, set this value to `ENABLED`. Valid values are `ENABLED` or `PAUSED`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time, in UTC and extended RFC 3339 format, of the most recent change to the status of the relationship between the account and the administrator account.
        """
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated_at", value)


class Member(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 invitation_disable_email_notification: Optional[pulumi.Input[bool]] = None,
                 invitation_message: Optional[pulumi.Input[str]] = None,
                 invite: Optional[pulumi.Input[bool]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a resource to manage an [Amazon Macie Member](https://docs.aws.amazon.com/macie/latest/APIReference/members-id.html).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example_account = aws.macie2.Account("exampleAccount")
        example_member = aws.macie2.Member("exampleMember",
            account_id="AWS ACCOUNT ID",
            email="EMAIL",
            invite=True,
            invitation_message="Message of the invitation",
            invitation_disable_email_notification=True,
            opts=pulumi.ResourceOptions(depends_on=[example_account]))
        ```

        ## Import

        Using `pulumi import`, import `aws_macie2_member` using the account ID of the member account. For example:

        ```sh
         $ pulumi import aws:macie2/member:Member example 123456789012
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The AWS account ID for the account.
        :param pulumi.Input[str] email: The email address for the account.
        :param pulumi.Input[bool] invitation_disable_email_notification: Specifies whether to send an email notification to the root user of each account that the invitation will be sent to. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. To send an email notification to the root user of each account, set this value to `true`.
        :param pulumi.Input[str] invitation_message: A custom message to include in the invitation. Amazon Macie adds this message to the standard content that it sends for an invitation.
        :param pulumi.Input[bool] invite: Send an invitation to a member
        :param pulumi.Input[str] status: Specifies the status for the account. To enable Amazon Macie and start all Macie activities for the account, set this value to `ENABLED`. Valid values are `ENABLED` or `PAUSED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MemberArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to manage an [Amazon Macie Member](https://docs.aws.amazon.com/macie/latest/APIReference/members-id.html).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example_account = aws.macie2.Account("exampleAccount")
        example_member = aws.macie2.Member("exampleMember",
            account_id="AWS ACCOUNT ID",
            email="EMAIL",
            invite=True,
            invitation_message="Message of the invitation",
            invitation_disable_email_notification=True,
            opts=pulumi.ResourceOptions(depends_on=[example_account]))
        ```

        ## Import

        Using `pulumi import`, import `aws_macie2_member` using the account ID of the member account. For example:

        ```sh
         $ pulumi import aws:macie2/member:Member example 123456789012
        ```

        :param str resource_name: The name of the resource.
        :param MemberArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MemberArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 invitation_disable_email_notification: Optional[pulumi.Input[bool]] = None,
                 invitation_message: Optional[pulumi.Input[str]] = None,
                 invite: Optional[pulumi.Input[bool]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MemberArgs.__new__(MemberArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if email is None and not opts.urn:
                raise TypeError("Missing required property 'email'")
            __props__.__dict__["email"] = email
            __props__.__dict__["invitation_disable_email_notification"] = invitation_disable_email_notification
            __props__.__dict__["invitation_message"] = invitation_message
            __props__.__dict__["invite"] = invite
            __props__.__dict__["status"] = status
            __props__.__dict__["tags"] = tags
            __props__.__dict__["administrator_account_id"] = None
            __props__.__dict__["arn"] = None
            __props__.__dict__["invited_at"] = None
            __props__.__dict__["master_account_id"] = None
            __props__.__dict__["relationship_status"] = None
            __props__.__dict__["tags_all"] = None
            __props__.__dict__["updated_at"] = None
        super(Member, __self__).__init__(
            'aws:macie2/member:Member',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            administrator_account_id: Optional[pulumi.Input[str]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            email: Optional[pulumi.Input[str]] = None,
            invitation_disable_email_notification: Optional[pulumi.Input[bool]] = None,
            invitation_message: Optional[pulumi.Input[str]] = None,
            invite: Optional[pulumi.Input[bool]] = None,
            invited_at: Optional[pulumi.Input[str]] = None,
            master_account_id: Optional[pulumi.Input[str]] = None,
            relationship_status: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            updated_at: Optional[pulumi.Input[str]] = None) -> 'Member':
        """
        Get an existing Member resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The AWS account ID for the account.
        :param pulumi.Input[str] administrator_account_id: The AWS account ID for the administrator account.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the account.
        :param pulumi.Input[str] email: The email address for the account.
        :param pulumi.Input[bool] invitation_disable_email_notification: Specifies whether to send an email notification to the root user of each account that the invitation will be sent to. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. To send an email notification to the root user of each account, set this value to `true`.
        :param pulumi.Input[str] invitation_message: A custom message to include in the invitation. Amazon Macie adds this message to the standard content that it sends for an invitation.
        :param pulumi.Input[bool] invite: Send an invitation to a member
        :param pulumi.Input[str] invited_at: The date and time, in UTC and extended RFC 3339 format, when an Amazon Macie membership invitation was last sent to the account. This value is null if a Macie invitation hasn't been sent to the account.
        :param pulumi.Input[str] relationship_status: The current status of the relationship between the account and the administrator account.
        :param pulumi.Input[str] status: Specifies the status for the account. To enable Amazon Macie and start all Macie activities for the account, set this value to `ENABLED`. Valid values are `ENABLED` or `PAUSED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie.
        :param pulumi.Input[str] updated_at: The date and time, in UTC and extended RFC 3339 format, of the most recent change to the status of the relationship between the account and the administrator account.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MemberState.__new__(_MemberState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["administrator_account_id"] = administrator_account_id
        __props__.__dict__["arn"] = arn
        __props__.__dict__["email"] = email
        __props__.__dict__["invitation_disable_email_notification"] = invitation_disable_email_notification
        __props__.__dict__["invitation_message"] = invitation_message
        __props__.__dict__["invite"] = invite
        __props__.__dict__["invited_at"] = invited_at
        __props__.__dict__["master_account_id"] = master_account_id
        __props__.__dict__["relationship_status"] = relationship_status
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["updated_at"] = updated_at
        return Member(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The AWS account ID for the account.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="administratorAccountId")
    def administrator_account_id(self) -> pulumi.Output[str]:
        """
        The AWS account ID for the administrator account.
        """
        return pulumi.get(self, "administrator_account_id")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the account.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def email(self) -> pulumi.Output[str]:
        """
        The email address for the account.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter(name="invitationDisableEmailNotification")
    def invitation_disable_email_notification(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to send an email notification to the root user of each account that the invitation will be sent to. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. To send an email notification to the root user of each account, set this value to `true`.
        """
        return pulumi.get(self, "invitation_disable_email_notification")

    @property
    @pulumi.getter(name="invitationMessage")
    def invitation_message(self) -> pulumi.Output[Optional[str]]:
        """
        A custom message to include in the invitation. Amazon Macie adds this message to the standard content that it sends for an invitation.
        """
        return pulumi.get(self, "invitation_message")

    @property
    @pulumi.getter
    def invite(self) -> pulumi.Output[bool]:
        """
        Send an invitation to a member
        """
        return pulumi.get(self, "invite")

    @property
    @pulumi.getter(name="invitedAt")
    def invited_at(self) -> pulumi.Output[str]:
        """
        The date and time, in UTC and extended RFC 3339 format, when an Amazon Macie membership invitation was last sent to the account. This value is null if a Macie invitation hasn't been sent to the account.
        """
        return pulumi.get(self, "invited_at")

    @property
    @pulumi.getter(name="masterAccountId")
    def master_account_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "master_account_id")

    @property
    @pulumi.getter(name="relationshipStatus")
    def relationship_status(self) -> pulumi.Output[str]:
        """
        The current status of the relationship between the account and the administrator account.
        """
        return pulumi.get(self, "relationship_status")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Specifies the status for the account. To enable Amazon Macie and start all Macie activities for the account, set this value to `ENABLED`. Valid values are `ENABLED` or `PAUSED`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[str]:
        """
        The date and time, in UTC and extended RFC 3339 format, of the most recent change to the status of the relationship between the account and the administrator account.
        """
        return pulumi.get(self, "updated_at")

