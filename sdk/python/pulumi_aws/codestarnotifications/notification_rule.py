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

__all__ = ['NotificationRuleArgs', 'NotificationRule']

@pulumi.input_type
class NotificationRuleArgs:
    def __init__(__self__, *,
                 detail_type: pulumi.Input[str],
                 event_type_ids: pulumi.Input[Sequence[pulumi.Input[str]]],
                 resource: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 targets: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationRuleTargetArgs']]]] = None):
        """
        The set of arguments for constructing a NotificationRule resource.
        :param pulumi.Input[str] detail_type: The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] event_type_ids: A list of event types associated with this notification rule.
               For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
        :param pulumi.Input[str] resource: The ARN of the resource to associate with the notification rule.
        :param pulumi.Input[str] name: The name of notification rule.
        :param pulumi.Input[str] status: The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Sequence[pulumi.Input['NotificationRuleTargetArgs']]] targets: Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
        """
        pulumi.set(__self__, "detail_type", detail_type)
        pulumi.set(__self__, "event_type_ids", event_type_ids)
        pulumi.set(__self__, "resource", resource)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if targets is not None:
            pulumi.set(__self__, "targets", targets)

    @property
    @pulumi.getter(name="detailType")
    def detail_type(self) -> pulumi.Input[str]:
        """
        The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
        """
        return pulumi.get(self, "detail_type")

    @detail_type.setter
    def detail_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "detail_type", value)

    @property
    @pulumi.getter(name="eventTypeIds")
    def event_type_ids(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A list of event types associated with this notification rule.
        For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
        """
        return pulumi.get(self, "event_type_ids")

    @event_type_ids.setter
    def event_type_ids(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "event_type_ids", value)

    @property
    @pulumi.getter
    def resource(self) -> pulumi.Input[str]:
        """
        The ARN of the resource to associate with the notification rule.
        """
        return pulumi.get(self, "resource")

    @resource.setter
    def resource(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of notification rule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def targets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NotificationRuleTargetArgs']]]]:
        """
        Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
        """
        return pulumi.get(self, "targets")

    @targets.setter
    def targets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationRuleTargetArgs']]]]):
        pulumi.set(self, "targets", value)


@pulumi.input_type
class _NotificationRuleState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 detail_type: Optional[pulumi.Input[str]] = None,
                 event_type_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 targets: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationRuleTargetArgs']]]] = None):
        """
        Input properties used for looking up and filtering NotificationRule resources.
        :param pulumi.Input[str] arn: The codestar notification rule ARN.
        :param pulumi.Input[str] detail_type: The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] event_type_ids: A list of event types associated with this notification rule.
               For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
        :param pulumi.Input[str] name: The name of notification rule.
        :param pulumi.Input[str] resource: The ARN of the resource to associate with the notification rule.
        :param pulumi.Input[str] status: The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[Sequence[pulumi.Input['NotificationRuleTargetArgs']]] targets: Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if detail_type is not None:
            pulumi.set(__self__, "detail_type", detail_type)
        if event_type_ids is not None:
            pulumi.set(__self__, "event_type_ids", event_type_ids)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource is not None:
            pulumi.set(__self__, "resource", resource)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if targets is not None:
            pulumi.set(__self__, "targets", targets)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The codestar notification rule ARN.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="detailType")
    def detail_type(self) -> Optional[pulumi.Input[str]]:
        """
        The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
        """
        return pulumi.get(self, "detail_type")

    @detail_type.setter
    def detail_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "detail_type", value)

    @property
    @pulumi.getter(name="eventTypeIds")
    def event_type_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of event types associated with this notification rule.
        For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
        """
        return pulumi.get(self, "event_type_ids")

    @event_type_ids.setter
    def event_type_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "event_type_ids", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of notification rule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def resource(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the resource to associate with the notification rule.
        """
        return pulumi.get(self, "resource")

    @resource.setter
    def resource(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    @pulumi.getter
    def targets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NotificationRuleTargetArgs']]]]:
        """
        Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
        """
        return pulumi.get(self, "targets")

    @targets.setter
    def targets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationRuleTargetArgs']]]]):
        pulumi.set(self, "targets", value)


class NotificationRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 detail_type: Optional[pulumi.Input[str]] = None,
                 event_type_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 targets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['NotificationRuleTargetArgs', 'NotificationRuleTargetArgsDict']]]]] = None,
                 __props__=None):
        """
        Provides a CodeStar Notifications Rule.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        code = aws.codecommit.Repository("code", repository_name="example-code-repo")
        notif = aws.sns.Topic("notif", name="notification")
        notif_access = notif.arn.apply(lambda arn: aws.iam.get_policy_document_output(statements=[{
            "actions": ["sns:Publish"],
            "principals": [{
                "type": "Service",
                "identifiers": ["codestar-notifications.amazonaws.com"],
            }],
            "resources": [arn],
        }]))
        default = aws.sns.TopicPolicy("default",
            arn=notif.arn,
            policy=notif_access.json)
        commits = aws.codestarnotifications.NotificationRule("commits",
            detail_type="BASIC",
            event_type_ids=["codecommit-repository-comments-on-commits"],
            name="example-code-repo-commits",
            resource=code.arn,
            targets=[{
                "address": notif.arn,
            }])
        ```

        ## Import

        Using `pulumi import`, import CodeStar notification rule using the ARN. For example:

        ```sh
        $ pulumi import aws:codestarnotifications/notificationRule:NotificationRule foo arn:aws:codestar-notifications:us-west-1:0123456789:notificationrule/2cdc68a3-8f7c-4893-b6a5-45b362bd4f2b
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] detail_type: The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] event_type_ids: A list of event types associated with this notification rule.
               For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
        :param pulumi.Input[str] name: The name of notification rule.
        :param pulumi.Input[str] resource: The ARN of the resource to associate with the notification rule.
        :param pulumi.Input[str] status: The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Sequence[pulumi.Input[Union['NotificationRuleTargetArgs', 'NotificationRuleTargetArgsDict']]]] targets: Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NotificationRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CodeStar Notifications Rule.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        code = aws.codecommit.Repository("code", repository_name="example-code-repo")
        notif = aws.sns.Topic("notif", name="notification")
        notif_access = notif.arn.apply(lambda arn: aws.iam.get_policy_document_output(statements=[{
            "actions": ["sns:Publish"],
            "principals": [{
                "type": "Service",
                "identifiers": ["codestar-notifications.amazonaws.com"],
            }],
            "resources": [arn],
        }]))
        default = aws.sns.TopicPolicy("default",
            arn=notif.arn,
            policy=notif_access.json)
        commits = aws.codestarnotifications.NotificationRule("commits",
            detail_type="BASIC",
            event_type_ids=["codecommit-repository-comments-on-commits"],
            name="example-code-repo-commits",
            resource=code.arn,
            targets=[{
                "address": notif.arn,
            }])
        ```

        ## Import

        Using `pulumi import`, import CodeStar notification rule using the ARN. For example:

        ```sh
        $ pulumi import aws:codestarnotifications/notificationRule:NotificationRule foo arn:aws:codestar-notifications:us-west-1:0123456789:notificationrule/2cdc68a3-8f7c-4893-b6a5-45b362bd4f2b
        ```

        :param str resource_name: The name of the resource.
        :param NotificationRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NotificationRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 detail_type: Optional[pulumi.Input[str]] = None,
                 event_type_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 targets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['NotificationRuleTargetArgs', 'NotificationRuleTargetArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NotificationRuleArgs.__new__(NotificationRuleArgs)

            if detail_type is None and not opts.urn:
                raise TypeError("Missing required property 'detail_type'")
            __props__.__dict__["detail_type"] = detail_type
            if event_type_ids is None and not opts.urn:
                raise TypeError("Missing required property 'event_type_ids'")
            __props__.__dict__["event_type_ids"] = event_type_ids
            __props__.__dict__["name"] = name
            if resource is None and not opts.urn:
                raise TypeError("Missing required property 'resource'")
            __props__.__dict__["resource"] = resource
            __props__.__dict__["status"] = status
            __props__.__dict__["tags"] = tags
            __props__.__dict__["targets"] = targets
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(NotificationRule, __self__).__init__(
            'aws:codestarnotifications/notificationRule:NotificationRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            detail_type: Optional[pulumi.Input[str]] = None,
            event_type_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            resource: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            targets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['NotificationRuleTargetArgs', 'NotificationRuleTargetArgsDict']]]]] = None) -> 'NotificationRule':
        """
        Get an existing NotificationRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The codestar notification rule ARN.
        :param pulumi.Input[str] detail_type: The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] event_type_ids: A list of event types associated with this notification rule.
               For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
        :param pulumi.Input[str] name: The name of notification rule.
        :param pulumi.Input[str] resource: The ARN of the resource to associate with the notification rule.
        :param pulumi.Input[str] status: The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[Sequence[pulumi.Input[Union['NotificationRuleTargetArgs', 'NotificationRuleTargetArgsDict']]]] targets: Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NotificationRuleState.__new__(_NotificationRuleState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["detail_type"] = detail_type
        __props__.__dict__["event_type_ids"] = event_type_ids
        __props__.__dict__["name"] = name
        __props__.__dict__["resource"] = resource
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["targets"] = targets
        return NotificationRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The codestar notification rule ARN.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="detailType")
    def detail_type(self) -> pulumi.Output[str]:
        """
        The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
        """
        return pulumi.get(self, "detail_type")

    @property
    @pulumi.getter(name="eventTypeIds")
    def event_type_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of event types associated with this notification rule.
        For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
        """
        return pulumi.get(self, "event_type_ids")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of notification rule.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def resource(self) -> pulumi.Output[str]:
        """
        The ARN of the resource to associate with the notification rule.
        """
        return pulumi.get(self, "resource")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[Optional[str]]:
        """
        The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    @pulumi.getter
    def targets(self) -> pulumi.Output[Optional[Sequence['outputs.NotificationRuleTarget']]]:
        """
        Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
        """
        return pulumi.get(self, "targets")

