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

__all__ = ['EventBusPolicyArgs', 'EventBusPolicy']

@pulumi.input_type
class EventBusPolicyArgs:
    def __init__(__self__, *,
                 policy: pulumi.Input[str],
                 event_bus_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a EventBusPolicy resource.
        :param pulumi.Input[str] policy: The text of the policy.
        :param pulumi.Input[str] event_bus_name: The name of the event bus to set the permissions on.
               If you omit this, the permissions are set on the `default` event bus.
        """
        pulumi.set(__self__, "policy", policy)
        if event_bus_name is not None:
            pulumi.set(__self__, "event_bus_name", event_bus_name)

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Input[str]:
        """
        The text of the policy.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter(name="eventBusName")
    def event_bus_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the event bus to set the permissions on.
        If you omit this, the permissions are set on the `default` event bus.
        """
        return pulumi.get(self, "event_bus_name")

    @event_bus_name.setter
    def event_bus_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "event_bus_name", value)


@pulumi.input_type
class _EventBusPolicyState:
    def __init__(__self__, *,
                 event_bus_name: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering EventBusPolicy resources.
        :param pulumi.Input[str] event_bus_name: The name of the event bus to set the permissions on.
               If you omit this, the permissions are set on the `default` event bus.
        :param pulumi.Input[str] policy: The text of the policy.
        """
        if event_bus_name is not None:
            pulumi.set(__self__, "event_bus_name", event_bus_name)
        if policy is not None:
            pulumi.set(__self__, "policy", policy)

    @property
    @pulumi.getter(name="eventBusName")
    def event_bus_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the event bus to set the permissions on.
        If you omit this, the permissions are set on the `default` event bus.
        """
        return pulumi.get(self, "event_bus_name")

    @event_bus_name.setter
    def event_bus_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "event_bus_name", value)

    @property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[str]]:
        """
        The text of the policy.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy", value)


class EventBusPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 event_bus_name: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource to create an EventBridge resource policy to support cross-account events.

        > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.

        > **Note:** The EventBridge bus policy resource  (`cloudwatch.EventBusPolicy`) is incompatible with the EventBridge permission resource (`cloudwatch.EventPermission`) and will overwrite permissions.

        ## Example Usage

        ### Account Access

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.iam.get_policy_document(statements=[{
            "sid": "DevAccountAccess",
            "effect": "Allow",
            "actions": ["events:PutEvents"],
            "resources": ["arn:aws:events:eu-west-1:123456789012:event-bus/default"],
            "principals": [{
                "type": "AWS",
                "identifiers": ["123456789012"],
            }],
        }])
        test_event_bus_policy = aws.cloudwatch.EventBusPolicy("test",
            policy=test.json,
            event_bus_name=test_aws_cloudwatch_event_bus["name"])
        ```

        ### Organization Access

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.iam.get_policy_document(statements=[{
            "sid": "OrganizationAccess",
            "effect": "Allow",
            "actions": [
                "events:DescribeRule",
                "events:ListRules",
                "events:ListTargetsByRule",
                "events:ListTagsForResource",
            ],
            "resources": [
                "arn:aws:events:eu-west-1:123456789012:rule/*",
                "arn:aws:events:eu-west-1:123456789012:event-bus/default",
            ],
            "principals": [{
                "type": "AWS",
                "identifiers": ["*"],
            }],
            "conditions": [{
                "test": "StringEquals",
                "variable": "aws:PrincipalOrgID",
                "values": [example["id"]],
            }],
        }])
        test_event_bus_policy = aws.cloudwatch.EventBusPolicy("test",
            policy=test.json,
            event_bus_name=test_aws_cloudwatch_event_bus["name"])
        ```

        ### Multiple Statements

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.iam.get_policy_document(statements=[
            {
                "sid": "DevAccountAccess",
                "effect": "Allow",
                "actions": ["events:PutEvents"],
                "resources": ["arn:aws:events:eu-west-1:123456789012:event-bus/default"],
                "principals": [{
                    "type": "AWS",
                    "identifiers": ["123456789012"],
                }],
            },
            {
                "sid": "OrganizationAccess",
                "effect": "Allow",
                "actions": [
                    "events:DescribeRule",
                    "events:ListRules",
                    "events:ListTargetsByRule",
                    "events:ListTagsForResource",
                ],
                "resources": [
                    "arn:aws:events:eu-west-1:123456789012:rule/*",
                    "arn:aws:events:eu-west-1:123456789012:event-bus/default",
                ],
                "principals": [{
                    "type": "AWS",
                    "identifiers": ["*"],
                }],
                "conditions": [{
                    "test": "StringEquals",
                    "variable": "aws:PrincipalOrgID",
                    "values": [example["id"]],
                }],
            },
        ])
        test_event_bus_policy = aws.cloudwatch.EventBusPolicy("test",
            policy=test.json,
            event_bus_name=test_aws_cloudwatch_event_bus["name"])
        ```

        ## Import

        Using `pulumi import`, import an EventBridge policy using the `event_bus_name`. For example:

        ```sh
        $ pulumi import aws:cloudwatch/eventBusPolicy:EventBusPolicy DevAccountAccess example-event-bus
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] event_bus_name: The name of the event bus to set the permissions on.
               If you omit this, the permissions are set on the `default` event bus.
        :param pulumi.Input[str] policy: The text of the policy.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EventBusPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to create an EventBridge resource policy to support cross-account events.

        > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.

        > **Note:** The EventBridge bus policy resource  (`cloudwatch.EventBusPolicy`) is incompatible with the EventBridge permission resource (`cloudwatch.EventPermission`) and will overwrite permissions.

        ## Example Usage

        ### Account Access

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.iam.get_policy_document(statements=[{
            "sid": "DevAccountAccess",
            "effect": "Allow",
            "actions": ["events:PutEvents"],
            "resources": ["arn:aws:events:eu-west-1:123456789012:event-bus/default"],
            "principals": [{
                "type": "AWS",
                "identifiers": ["123456789012"],
            }],
        }])
        test_event_bus_policy = aws.cloudwatch.EventBusPolicy("test",
            policy=test.json,
            event_bus_name=test_aws_cloudwatch_event_bus["name"])
        ```

        ### Organization Access

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.iam.get_policy_document(statements=[{
            "sid": "OrganizationAccess",
            "effect": "Allow",
            "actions": [
                "events:DescribeRule",
                "events:ListRules",
                "events:ListTargetsByRule",
                "events:ListTagsForResource",
            ],
            "resources": [
                "arn:aws:events:eu-west-1:123456789012:rule/*",
                "arn:aws:events:eu-west-1:123456789012:event-bus/default",
            ],
            "principals": [{
                "type": "AWS",
                "identifiers": ["*"],
            }],
            "conditions": [{
                "test": "StringEquals",
                "variable": "aws:PrincipalOrgID",
                "values": [example["id"]],
            }],
        }])
        test_event_bus_policy = aws.cloudwatch.EventBusPolicy("test",
            policy=test.json,
            event_bus_name=test_aws_cloudwatch_event_bus["name"])
        ```

        ### Multiple Statements

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.iam.get_policy_document(statements=[
            {
                "sid": "DevAccountAccess",
                "effect": "Allow",
                "actions": ["events:PutEvents"],
                "resources": ["arn:aws:events:eu-west-1:123456789012:event-bus/default"],
                "principals": [{
                    "type": "AWS",
                    "identifiers": ["123456789012"],
                }],
            },
            {
                "sid": "OrganizationAccess",
                "effect": "Allow",
                "actions": [
                    "events:DescribeRule",
                    "events:ListRules",
                    "events:ListTargetsByRule",
                    "events:ListTagsForResource",
                ],
                "resources": [
                    "arn:aws:events:eu-west-1:123456789012:rule/*",
                    "arn:aws:events:eu-west-1:123456789012:event-bus/default",
                ],
                "principals": [{
                    "type": "AWS",
                    "identifiers": ["*"],
                }],
                "conditions": [{
                    "test": "StringEquals",
                    "variable": "aws:PrincipalOrgID",
                    "values": [example["id"]],
                }],
            },
        ])
        test_event_bus_policy = aws.cloudwatch.EventBusPolicy("test",
            policy=test.json,
            event_bus_name=test_aws_cloudwatch_event_bus["name"])
        ```

        ## Import

        Using `pulumi import`, import an EventBridge policy using the `event_bus_name`. For example:

        ```sh
        $ pulumi import aws:cloudwatch/eventBusPolicy:EventBusPolicy DevAccountAccess example-event-bus
        ```

        :param str resource_name: The name of the resource.
        :param EventBusPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EventBusPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 event_bus_name: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EventBusPolicyArgs.__new__(EventBusPolicyArgs)

            __props__.__dict__["event_bus_name"] = event_bus_name
            if policy is None and not opts.urn:
                raise TypeError("Missing required property 'policy'")
            __props__.__dict__["policy"] = policy
        super(EventBusPolicy, __self__).__init__(
            'aws:cloudwatch/eventBusPolicy:EventBusPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            event_bus_name: Optional[pulumi.Input[str]] = None,
            policy: Optional[pulumi.Input[str]] = None) -> 'EventBusPolicy':
        """
        Get an existing EventBusPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] event_bus_name: The name of the event bus to set the permissions on.
               If you omit this, the permissions are set on the `default` event bus.
        :param pulumi.Input[str] policy: The text of the policy.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EventBusPolicyState.__new__(_EventBusPolicyState)

        __props__.__dict__["event_bus_name"] = event_bus_name
        __props__.__dict__["policy"] = policy
        return EventBusPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="eventBusName")
    def event_bus_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the event bus to set the permissions on.
        If you omit this, the permissions are set on the `default` event bus.
        """
        return pulumi.get(self, "event_bus_name")

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Output[str]:
        """
        The text of the policy.
        """
        return pulumi.get(self, "policy")

