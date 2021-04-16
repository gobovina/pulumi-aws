# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ListenerRuleArgs', 'ListenerRule']

@pulumi.input_type
class ListenerRuleArgs:
    def __init__(__self__, *,
                 actions: pulumi.Input[Sequence[pulumi.Input['ListenerRuleActionArgs']]],
                 conditions: pulumi.Input[Sequence[pulumi.Input['ListenerRuleConditionArgs']]],
                 listener_arn: pulumi.Input[str],
                 priority: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a ListenerRule resource.
        :param pulumi.Input[Sequence[pulumi.Input['ListenerRuleActionArgs']]] actions: An Action block. Action blocks are documented below.
        :param pulumi.Input[Sequence[pulumi.Input['ListenerRuleConditionArgs']]] conditions: A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
        :param pulumi.Input[str] listener_arn: The ARN of the listener to which to attach the rule.
        :param pulumi.Input[int] priority: The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
        """
        pulumi.set(__self__, "actions", actions)
        pulumi.set(__self__, "conditions", conditions)
        pulumi.set(__self__, "listener_arn", listener_arn)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)

    @property
    @pulumi.getter
    def actions(self) -> pulumi.Input[Sequence[pulumi.Input['ListenerRuleActionArgs']]]:
        """
        An Action block. Action blocks are documented below.
        """
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: pulumi.Input[Sequence[pulumi.Input['ListenerRuleActionArgs']]]):
        pulumi.set(self, "actions", value)

    @property
    @pulumi.getter
    def conditions(self) -> pulumi.Input[Sequence[pulumi.Input['ListenerRuleConditionArgs']]]:
        """
        A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
        """
        return pulumi.get(self, "conditions")

    @conditions.setter
    def conditions(self, value: pulumi.Input[Sequence[pulumi.Input['ListenerRuleConditionArgs']]]):
        pulumi.set(self, "conditions", value)

    @property
    @pulumi.getter(name="listenerArn")
    def listener_arn(self) -> pulumi.Input[str]:
        """
        The ARN of the listener to which to attach the rule.
        """
        return pulumi.get(self, "listener_arn")

    @listener_arn.setter
    def listener_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "listener_arn", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)


@pulumi.input_type
class _ListenerRuleState:
    def __init__(__self__, *,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input['ListenerRuleActionArgs']]]] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 conditions: Optional[pulumi.Input[Sequence[pulumi.Input['ListenerRuleConditionArgs']]]] = None,
                 listener_arn: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering ListenerRule resources.
        :param pulumi.Input[Sequence[pulumi.Input['ListenerRuleActionArgs']]] actions: An Action block. Action blocks are documented below.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the target group.
        :param pulumi.Input[Sequence[pulumi.Input['ListenerRuleConditionArgs']]] conditions: A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
        :param pulumi.Input[str] listener_arn: The ARN of the listener to which to attach the rule.
        :param pulumi.Input[int] priority: The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
        """
        if actions is not None:
            pulumi.set(__self__, "actions", actions)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if conditions is not None:
            pulumi.set(__self__, "conditions", conditions)
        if listener_arn is not None:
            pulumi.set(__self__, "listener_arn", listener_arn)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)

    @property
    @pulumi.getter
    def actions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ListenerRuleActionArgs']]]]:
        """
        An Action block. Action blocks are documented below.
        """
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ListenerRuleActionArgs']]]]):
        pulumi.set(self, "actions", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the target group.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def conditions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ListenerRuleConditionArgs']]]]:
        """
        A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
        """
        return pulumi.get(self, "conditions")

    @conditions.setter
    def conditions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ListenerRuleConditionArgs']]]]):
        pulumi.set(self, "conditions", value)

    @property
    @pulumi.getter(name="listenerArn")
    def listener_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the listener to which to attach the rule.
        """
        return pulumi.get(self, "listener_arn")

    @listener_arn.setter
    def listener_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "listener_arn", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)


class ListenerRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ListenerRuleActionArgs']]]]] = None,
                 conditions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ListenerRuleConditionArgs']]]]] = None,
                 listener_arn: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides a Load Balancer Listener Rule resource.

        > **Note:** `alb.ListenerRule` is known as `lb.ListenerRule`. The functionality is identical.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        front_end_load_balancer = aws.lb.LoadBalancer("frontEndLoadBalancer")
        # ...
        front_end_listener = aws.lb.Listener("frontEndListener")
        # Other parameters
        static = aws.lb.ListenerRule("static",
            listener_arn=front_end_listener.arn,
            priority=100,
            actions=[aws.lb.ListenerRuleActionArgs(
                type="forward",
                target_group_arn=aws_lb_target_group["static"]["arn"],
            )],
            conditions=[
                aws.lb.ListenerRuleConditionArgs(
                    path_pattern=aws.lb.ListenerRuleConditionPathPatternArgs(
                        values=["/static/*"],
                    ),
                ),
                aws.lb.ListenerRuleConditionArgs(
                    host_header=aws.lb.ListenerRuleConditionHostHeaderArgs(
                        values=["example.com"],
                    ),
                ),
            ])
        # Forward action
        host_based_weighted_routing = aws.lb.ListenerRule("hostBasedWeightedRouting",
            listener_arn=front_end_listener.arn,
            priority=99,
            actions=[aws.lb.ListenerRuleActionArgs(
                type="forward",
                target_group_arn=aws_lb_target_group["static"]["arn"],
            )],
            conditions=[aws.lb.ListenerRuleConditionArgs(
                host_header=aws.lb.ListenerRuleConditionHostHeaderArgs(
                    values=["my-service.*.mycompany.io"],
                ),
            )])
        # Weighted Forward action
        host_based_routing = aws.lb.ListenerRule("hostBasedRouting",
            listener_arn=front_end_listener.arn,
            priority=99,
            actions=[aws.lb.ListenerRuleActionArgs(
                type="forward",
                forward=aws.lb.ListenerRuleActionForwardArgs(
                    target_groups=[
                        aws.lb.ListenerRuleActionForwardTargetGroupArgs(
                            arn=aws_lb_target_group["main"]["arn"],
                            weight=80,
                        ),
                        aws.lb.ListenerRuleActionForwardTargetGroupArgs(
                            arn=aws_lb_target_group["canary"]["arn"],
                            weight=20,
                        ),
                    ],
                    stickiness=aws.lb.ListenerRuleActionForwardStickinessArgs(
                        enabled=True,
                        duration=600,
                    ),
                ),
            )],
            conditions=[aws.lb.ListenerRuleConditionArgs(
                host_header=aws.lb.ListenerRuleConditionHostHeaderArgs(
                    values=["my-service.*.mycompany.io"],
                ),
            )])
        # Redirect action
        redirect_http_to_https = aws.lb.ListenerRule("redirectHttpToHttps",
            listener_arn=front_end_listener.arn,
            actions=[aws.lb.ListenerRuleActionArgs(
                type="redirect",
                redirect=aws.lb.ListenerRuleActionRedirectArgs(
                    port="443",
                    protocol="HTTPS",
                    status_code="HTTP_301",
                ),
            )],
            conditions=[aws.lb.ListenerRuleConditionArgs(
                http_header=aws.lb.ListenerRuleConditionHttpHeaderArgs(
                    http_header_name="X-Forwarded-For",
                    values=["192.168.1.*"],
                ),
            )])
        # Fixed-response action
        health_check = aws.lb.ListenerRule("healthCheck",
            listener_arn=front_end_listener.arn,
            actions=[aws.lb.ListenerRuleActionArgs(
                type="fixed-response",
                fixed_response=aws.lb.ListenerRuleActionFixedResponseArgs(
                    content_type="text/plain",
                    message_body="HEALTHY",
                    status_code="200",
                ),
            )],
            conditions=[aws.lb.ListenerRuleConditionArgs(
                query_strings=[
                    aws.lb.ListenerRuleConditionQueryStringArgs(
                        key="health",
                        value="check",
                    ),
                    aws.lb.ListenerRuleConditionQueryStringArgs(
                        value="bar",
                    ),
                ],
            )])
        # Authenticate-cognito Action
        pool = aws.cognito.UserPool("pool")
        # ...
        client = aws.cognito.UserPoolClient("client")
        # ...
        domain = aws.cognito.UserPoolDomain("domain")
        # ...
        admin = aws.lb.ListenerRule("admin",
            listener_arn=front_end_listener.arn,
            actions=[
                aws.lb.ListenerRuleActionArgs(
                    type="authenticate-cognito",
                    authenticate_cognito=aws.lb.ListenerRuleActionAuthenticateCognitoArgs(
                        user_pool_arn=pool.arn,
                        user_pool_client_id=client.id,
                        user_pool_domain=domain.domain,
                    ),
                ),
                aws.lb.ListenerRuleActionArgs(
                    type="forward",
                    target_group_arn=aws_lb_target_group["static"]["arn"],
                ),
            ])
        # Authenticate-oidc Action
        oidc = aws.lb.ListenerRule("oidc",
            listener_arn=front_end_listener.arn,
            actions=[
                aws.lb.ListenerRuleActionArgs(
                    type="authenticate-oidc",
                    authenticate_oidc=aws.lb.ListenerRuleActionAuthenticateOidcArgs(
                        authorization_endpoint="https://example.com/authorization_endpoint",
                        client_id="client_id",
                        client_secret="client_secret",
                        issuer="https://example.com",
                        token_endpoint="https://example.com/token_endpoint",
                        user_info_endpoint="https://example.com/user_info_endpoint",
                    ),
                ),
                aws.lb.ListenerRuleActionArgs(
                    type="forward",
                    target_group_arn=aws_lb_target_group["static"]["arn"],
                ),
            ])
        ```

        ## Import

        Rules can be imported using their ARN, e.g.

        ```sh
         $ pulumi import aws:alb/listenerRule:ListenerRule front_end arn:aws:elasticloadbalancing:us-west-2:187416307283:listener-rule/app/test/8e4497da625e2d8a/9ab28ade35828f96/67b3d2d36dd7c26b
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ListenerRuleActionArgs']]]] actions: An Action block. Action blocks are documented below.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ListenerRuleConditionArgs']]]] conditions: A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
        :param pulumi.Input[str] listener_arn: The ARN of the listener to which to attach the rule.
        :param pulumi.Input[int] priority: The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ListenerRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Load Balancer Listener Rule resource.

        > **Note:** `alb.ListenerRule` is known as `lb.ListenerRule`. The functionality is identical.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        front_end_load_balancer = aws.lb.LoadBalancer("frontEndLoadBalancer")
        # ...
        front_end_listener = aws.lb.Listener("frontEndListener")
        # Other parameters
        static = aws.lb.ListenerRule("static",
            listener_arn=front_end_listener.arn,
            priority=100,
            actions=[aws.lb.ListenerRuleActionArgs(
                type="forward",
                target_group_arn=aws_lb_target_group["static"]["arn"],
            )],
            conditions=[
                aws.lb.ListenerRuleConditionArgs(
                    path_pattern=aws.lb.ListenerRuleConditionPathPatternArgs(
                        values=["/static/*"],
                    ),
                ),
                aws.lb.ListenerRuleConditionArgs(
                    host_header=aws.lb.ListenerRuleConditionHostHeaderArgs(
                        values=["example.com"],
                    ),
                ),
            ])
        # Forward action
        host_based_weighted_routing = aws.lb.ListenerRule("hostBasedWeightedRouting",
            listener_arn=front_end_listener.arn,
            priority=99,
            actions=[aws.lb.ListenerRuleActionArgs(
                type="forward",
                target_group_arn=aws_lb_target_group["static"]["arn"],
            )],
            conditions=[aws.lb.ListenerRuleConditionArgs(
                host_header=aws.lb.ListenerRuleConditionHostHeaderArgs(
                    values=["my-service.*.mycompany.io"],
                ),
            )])
        # Weighted Forward action
        host_based_routing = aws.lb.ListenerRule("hostBasedRouting",
            listener_arn=front_end_listener.arn,
            priority=99,
            actions=[aws.lb.ListenerRuleActionArgs(
                type="forward",
                forward=aws.lb.ListenerRuleActionForwardArgs(
                    target_groups=[
                        aws.lb.ListenerRuleActionForwardTargetGroupArgs(
                            arn=aws_lb_target_group["main"]["arn"],
                            weight=80,
                        ),
                        aws.lb.ListenerRuleActionForwardTargetGroupArgs(
                            arn=aws_lb_target_group["canary"]["arn"],
                            weight=20,
                        ),
                    ],
                    stickiness=aws.lb.ListenerRuleActionForwardStickinessArgs(
                        enabled=True,
                        duration=600,
                    ),
                ),
            )],
            conditions=[aws.lb.ListenerRuleConditionArgs(
                host_header=aws.lb.ListenerRuleConditionHostHeaderArgs(
                    values=["my-service.*.mycompany.io"],
                ),
            )])
        # Redirect action
        redirect_http_to_https = aws.lb.ListenerRule("redirectHttpToHttps",
            listener_arn=front_end_listener.arn,
            actions=[aws.lb.ListenerRuleActionArgs(
                type="redirect",
                redirect=aws.lb.ListenerRuleActionRedirectArgs(
                    port="443",
                    protocol="HTTPS",
                    status_code="HTTP_301",
                ),
            )],
            conditions=[aws.lb.ListenerRuleConditionArgs(
                http_header=aws.lb.ListenerRuleConditionHttpHeaderArgs(
                    http_header_name="X-Forwarded-For",
                    values=["192.168.1.*"],
                ),
            )])
        # Fixed-response action
        health_check = aws.lb.ListenerRule("healthCheck",
            listener_arn=front_end_listener.arn,
            actions=[aws.lb.ListenerRuleActionArgs(
                type="fixed-response",
                fixed_response=aws.lb.ListenerRuleActionFixedResponseArgs(
                    content_type="text/plain",
                    message_body="HEALTHY",
                    status_code="200",
                ),
            )],
            conditions=[aws.lb.ListenerRuleConditionArgs(
                query_strings=[
                    aws.lb.ListenerRuleConditionQueryStringArgs(
                        key="health",
                        value="check",
                    ),
                    aws.lb.ListenerRuleConditionQueryStringArgs(
                        value="bar",
                    ),
                ],
            )])
        # Authenticate-cognito Action
        pool = aws.cognito.UserPool("pool")
        # ...
        client = aws.cognito.UserPoolClient("client")
        # ...
        domain = aws.cognito.UserPoolDomain("domain")
        # ...
        admin = aws.lb.ListenerRule("admin",
            listener_arn=front_end_listener.arn,
            actions=[
                aws.lb.ListenerRuleActionArgs(
                    type="authenticate-cognito",
                    authenticate_cognito=aws.lb.ListenerRuleActionAuthenticateCognitoArgs(
                        user_pool_arn=pool.arn,
                        user_pool_client_id=client.id,
                        user_pool_domain=domain.domain,
                    ),
                ),
                aws.lb.ListenerRuleActionArgs(
                    type="forward",
                    target_group_arn=aws_lb_target_group["static"]["arn"],
                ),
            ])
        # Authenticate-oidc Action
        oidc = aws.lb.ListenerRule("oidc",
            listener_arn=front_end_listener.arn,
            actions=[
                aws.lb.ListenerRuleActionArgs(
                    type="authenticate-oidc",
                    authenticate_oidc=aws.lb.ListenerRuleActionAuthenticateOidcArgs(
                        authorization_endpoint="https://example.com/authorization_endpoint",
                        client_id="client_id",
                        client_secret="client_secret",
                        issuer="https://example.com",
                        token_endpoint="https://example.com/token_endpoint",
                        user_info_endpoint="https://example.com/user_info_endpoint",
                    ),
                ),
                aws.lb.ListenerRuleActionArgs(
                    type="forward",
                    target_group_arn=aws_lb_target_group["static"]["arn"],
                ),
            ])
        ```

        ## Import

        Rules can be imported using their ARN, e.g.

        ```sh
         $ pulumi import aws:alb/listenerRule:ListenerRule front_end arn:aws:elasticloadbalancing:us-west-2:187416307283:listener-rule/app/test/8e4497da625e2d8a/9ab28ade35828f96/67b3d2d36dd7c26b
        ```

        :param str resource_name: The name of the resource.
        :param ListenerRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ListenerRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ListenerRuleActionArgs']]]]] = None,
                 conditions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ListenerRuleConditionArgs']]]]] = None,
                 listener_arn: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ListenerRuleArgs.__new__(ListenerRuleArgs)

            if actions is None and not opts.urn:
                raise TypeError("Missing required property 'actions'")
            __props__.__dict__["actions"] = actions
            if conditions is None and not opts.urn:
                raise TypeError("Missing required property 'conditions'")
            __props__.__dict__["conditions"] = conditions
            if listener_arn is None and not opts.urn:
                raise TypeError("Missing required property 'listener_arn'")
            __props__.__dict__["listener_arn"] = listener_arn
            __props__.__dict__["priority"] = priority
            __props__.__dict__["arn"] = None
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="aws:applicationloadbalancing/listenerRule:ListenerRule")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(ListenerRule, __self__).__init__(
            'aws:alb/listenerRule:ListenerRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            actions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ListenerRuleActionArgs']]]]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            conditions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ListenerRuleConditionArgs']]]]] = None,
            listener_arn: Optional[pulumi.Input[str]] = None,
            priority: Optional[pulumi.Input[int]] = None) -> 'ListenerRule':
        """
        Get an existing ListenerRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ListenerRuleActionArgs']]]] actions: An Action block. Action blocks are documented below.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the target group.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ListenerRuleConditionArgs']]]] conditions: A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
        :param pulumi.Input[str] listener_arn: The ARN of the listener to which to attach the rule.
        :param pulumi.Input[int] priority: The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ListenerRuleState.__new__(_ListenerRuleState)

        __props__.__dict__["actions"] = actions
        __props__.__dict__["arn"] = arn
        __props__.__dict__["conditions"] = conditions
        __props__.__dict__["listener_arn"] = listener_arn
        __props__.__dict__["priority"] = priority
        return ListenerRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def actions(self) -> pulumi.Output[Sequence['outputs.ListenerRuleAction']]:
        """
        An Action block. Action blocks are documented below.
        """
        return pulumi.get(self, "actions")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the target group.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def conditions(self) -> pulumi.Output[Sequence['outputs.ListenerRuleCondition']]:
        """
        A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
        """
        return pulumi.get(self, "conditions")

    @property
    @pulumi.getter(name="listenerArn")
    def listener_arn(self) -> pulumi.Output[str]:
        """
        The ARN of the listener to which to attach the rule.
        """
        return pulumi.get(self, "listener_arn")

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Output[int]:
        """
        The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
        """
        return pulumi.get(self, "priority")

