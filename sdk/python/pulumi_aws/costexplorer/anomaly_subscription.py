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

__all__ = ['AnomalySubscriptionArgs', 'AnomalySubscription']

@pulumi.input_type
class AnomalySubscriptionArgs:
    def __init__(__self__, *,
                 frequency: pulumi.Input[str],
                 monitor_arn_lists: pulumi.Input[Sequence[pulumi.Input[str]]],
                 subscribers: pulumi.Input[Sequence[pulumi.Input['AnomalySubscriptionSubscriberArgs']]],
                 account_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 threshold_expression: Optional[pulumi.Input['AnomalySubscriptionThresholdExpressionArgs']] = None):
        """
        The set of arguments for constructing a AnomalySubscription resource.
        :param pulumi.Input[str] frequency: The frequency that anomaly reports are sent. Valid Values: `DAILY` | `IMMEDIATE` | `WEEKLY`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] monitor_arn_lists: A list of cost anomaly monitors.
        :param pulumi.Input[Sequence[pulumi.Input['AnomalySubscriptionSubscriberArgs']]] subscribers: A subscriber configuration. Multiple subscribers can be defined.
        :param pulumi.Input[str] account_id: The unique identifier for the AWS account in which the anomaly subscription ought to be created.
        :param pulumi.Input[str] name: The name for the subscription.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input['AnomalySubscriptionThresholdExpressionArgs'] threshold_expression: An Expression object used to specify the anomalies that you want to generate alerts for. See Threshold Expression.
        """
        pulumi.set(__self__, "frequency", frequency)
        pulumi.set(__self__, "monitor_arn_lists", monitor_arn_lists)
        pulumi.set(__self__, "subscribers", subscribers)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if threshold_expression is not None:
            pulumi.set(__self__, "threshold_expression", threshold_expression)

    @property
    @pulumi.getter
    def frequency(self) -> pulumi.Input[str]:
        """
        The frequency that anomaly reports are sent. Valid Values: `DAILY` | `IMMEDIATE` | `WEEKLY`.
        """
        return pulumi.get(self, "frequency")

    @frequency.setter
    def frequency(self, value: pulumi.Input[str]):
        pulumi.set(self, "frequency", value)

    @property
    @pulumi.getter(name="monitorArnLists")
    def monitor_arn_lists(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A list of cost anomaly monitors.
        """
        return pulumi.get(self, "monitor_arn_lists")

    @monitor_arn_lists.setter
    def monitor_arn_lists(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "monitor_arn_lists", value)

    @property
    @pulumi.getter
    def subscribers(self) -> pulumi.Input[Sequence[pulumi.Input['AnomalySubscriptionSubscriberArgs']]]:
        """
        A subscriber configuration. Multiple subscribers can be defined.
        """
        return pulumi.get(self, "subscribers")

    @subscribers.setter
    def subscribers(self, value: pulumi.Input[Sequence[pulumi.Input['AnomalySubscriptionSubscriberArgs']]]):
        pulumi.set(self, "subscribers", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique identifier for the AWS account in which the anomaly subscription ought to be created.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the subscription.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

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
    @pulumi.getter(name="thresholdExpression")
    def threshold_expression(self) -> Optional[pulumi.Input['AnomalySubscriptionThresholdExpressionArgs']]:
        """
        An Expression object used to specify the anomalies that you want to generate alerts for. See Threshold Expression.
        """
        return pulumi.get(self, "threshold_expression")

    @threshold_expression.setter
    def threshold_expression(self, value: Optional[pulumi.Input['AnomalySubscriptionThresholdExpressionArgs']]):
        pulumi.set(self, "threshold_expression", value)


@pulumi.input_type
class _AnomalySubscriptionState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 frequency: Optional[pulumi.Input[str]] = None,
                 monitor_arn_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 subscribers: Optional[pulumi.Input[Sequence[pulumi.Input['AnomalySubscriptionSubscriberArgs']]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 threshold_expression: Optional[pulumi.Input['AnomalySubscriptionThresholdExpressionArgs']] = None):
        """
        Input properties used for looking up and filtering AnomalySubscription resources.
        :param pulumi.Input[str] account_id: The unique identifier for the AWS account in which the anomaly subscription ought to be created.
        :param pulumi.Input[str] arn: ARN of the anomaly subscription.
        :param pulumi.Input[str] frequency: The frequency that anomaly reports are sent. Valid Values: `DAILY` | `IMMEDIATE` | `WEEKLY`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] monitor_arn_lists: A list of cost anomaly monitors.
        :param pulumi.Input[str] name: The name for the subscription.
        :param pulumi.Input[Sequence[pulumi.Input['AnomalySubscriptionSubscriberArgs']]] subscribers: A subscriber configuration. Multiple subscribers can be defined.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input['AnomalySubscriptionThresholdExpressionArgs'] threshold_expression: An Expression object used to specify the anomalies that you want to generate alerts for. See Threshold Expression.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if frequency is not None:
            pulumi.set(__self__, "frequency", frequency)
        if monitor_arn_lists is not None:
            pulumi.set(__self__, "monitor_arn_lists", monitor_arn_lists)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if subscribers is not None:
            pulumi.set(__self__, "subscribers", subscribers)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if threshold_expression is not None:
            pulumi.set(__self__, "threshold_expression", threshold_expression)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique identifier for the AWS account in which the anomaly subscription ought to be created.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the anomaly subscription.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def frequency(self) -> Optional[pulumi.Input[str]]:
        """
        The frequency that anomaly reports are sent. Valid Values: `DAILY` | `IMMEDIATE` | `WEEKLY`.
        """
        return pulumi.get(self, "frequency")

    @frequency.setter
    def frequency(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "frequency", value)

    @property
    @pulumi.getter(name="monitorArnLists")
    def monitor_arn_lists(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of cost anomaly monitors.
        """
        return pulumi.get(self, "monitor_arn_lists")

    @monitor_arn_lists.setter
    def monitor_arn_lists(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "monitor_arn_lists", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the subscription.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def subscribers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AnomalySubscriptionSubscriberArgs']]]]:
        """
        A subscriber configuration. Multiple subscribers can be defined.
        """
        return pulumi.get(self, "subscribers")

    @subscribers.setter
    def subscribers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AnomalySubscriptionSubscriberArgs']]]]):
        pulumi.set(self, "subscribers", value)

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
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter(name="thresholdExpression")
    def threshold_expression(self) -> Optional[pulumi.Input['AnomalySubscriptionThresholdExpressionArgs']]:
        """
        An Expression object used to specify the anomalies that you want to generate alerts for. See Threshold Expression.
        """
        return pulumi.get(self, "threshold_expression")

    @threshold_expression.setter
    def threshold_expression(self, value: Optional[pulumi.Input['AnomalySubscriptionThresholdExpressionArgs']]):
        pulumi.set(self, "threshold_expression", value)


class AnomalySubscription(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 frequency: Optional[pulumi.Input[str]] = None,
                 monitor_arn_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 subscribers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AnomalySubscriptionSubscriberArgs']]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 threshold_expression: Optional[pulumi.Input[pulumi.InputType['AnomalySubscriptionThresholdExpressionArgs']]] = None,
                 __props__=None):
        """
        Provides a CE Anomaly Subscription.

        ## Example Usage
        ### Threshold Expression

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.costexplorer.AnomalySubscription("test",
            frequency="DAILY",
            monitor_arn_lists=[aws_ce_anomaly_monitor["test"]["arn"]],
            subscribers=[aws.costexplorer.AnomalySubscriptionSubscriberArgs(
                type="EMAIL",
                address="abc@example.com",
            )],
            threshold_expression=aws.costexplorer.AnomalySubscriptionThresholdExpressionArgs(
                dimension=aws.costexplorer.AnomalySubscriptionThresholdExpressionDimensionArgs(
                    key="ANOMALY_TOTAL_IMPACT_ABSOLUTE",
                    values=["100.0"],
                    match_options=["GREATER_THAN_OR_EQUAL"],
                ),
            ))
        ```

        ## Import

        Using `pulumi import`, import `aws_ce_anomaly_subscription` using the `id`. For example:

        ```sh
         $ pulumi import aws:costexplorer/anomalySubscription:AnomalySubscription example AnomalySubscriptionARN
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The unique identifier for the AWS account in which the anomaly subscription ought to be created.
        :param pulumi.Input[str] frequency: The frequency that anomaly reports are sent. Valid Values: `DAILY` | `IMMEDIATE` | `WEEKLY`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] monitor_arn_lists: A list of cost anomaly monitors.
        :param pulumi.Input[str] name: The name for the subscription.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AnomalySubscriptionSubscriberArgs']]]] subscribers: A subscriber configuration. Multiple subscribers can be defined.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[pulumi.InputType['AnomalySubscriptionThresholdExpressionArgs']] threshold_expression: An Expression object used to specify the anomalies that you want to generate alerts for. See Threshold Expression.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AnomalySubscriptionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CE Anomaly Subscription.

        ## Example Usage
        ### Threshold Expression

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.costexplorer.AnomalySubscription("test",
            frequency="DAILY",
            monitor_arn_lists=[aws_ce_anomaly_monitor["test"]["arn"]],
            subscribers=[aws.costexplorer.AnomalySubscriptionSubscriberArgs(
                type="EMAIL",
                address="abc@example.com",
            )],
            threshold_expression=aws.costexplorer.AnomalySubscriptionThresholdExpressionArgs(
                dimension=aws.costexplorer.AnomalySubscriptionThresholdExpressionDimensionArgs(
                    key="ANOMALY_TOTAL_IMPACT_ABSOLUTE",
                    values=["100.0"],
                    match_options=["GREATER_THAN_OR_EQUAL"],
                ),
            ))
        ```

        ## Import

        Using `pulumi import`, import `aws_ce_anomaly_subscription` using the `id`. For example:

        ```sh
         $ pulumi import aws:costexplorer/anomalySubscription:AnomalySubscription example AnomalySubscriptionARN
        ```

        :param str resource_name: The name of the resource.
        :param AnomalySubscriptionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AnomalySubscriptionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 frequency: Optional[pulumi.Input[str]] = None,
                 monitor_arn_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 subscribers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AnomalySubscriptionSubscriberArgs']]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 threshold_expression: Optional[pulumi.Input[pulumi.InputType['AnomalySubscriptionThresholdExpressionArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AnomalySubscriptionArgs.__new__(AnomalySubscriptionArgs)

            __props__.__dict__["account_id"] = account_id
            if frequency is None and not opts.urn:
                raise TypeError("Missing required property 'frequency'")
            __props__.__dict__["frequency"] = frequency
            if monitor_arn_lists is None and not opts.urn:
                raise TypeError("Missing required property 'monitor_arn_lists'")
            __props__.__dict__["monitor_arn_lists"] = monitor_arn_lists
            __props__.__dict__["name"] = name
            if subscribers is None and not opts.urn:
                raise TypeError("Missing required property 'subscribers'")
            __props__.__dict__["subscribers"] = subscribers
            __props__.__dict__["tags"] = tags
            __props__.__dict__["threshold_expression"] = threshold_expression
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(AnomalySubscription, __self__).__init__(
            'aws:costexplorer/anomalySubscription:AnomalySubscription',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            frequency: Optional[pulumi.Input[str]] = None,
            monitor_arn_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            subscribers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AnomalySubscriptionSubscriberArgs']]]]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            threshold_expression: Optional[pulumi.Input[pulumi.InputType['AnomalySubscriptionThresholdExpressionArgs']]] = None) -> 'AnomalySubscription':
        """
        Get an existing AnomalySubscription resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The unique identifier for the AWS account in which the anomaly subscription ought to be created.
        :param pulumi.Input[str] arn: ARN of the anomaly subscription.
        :param pulumi.Input[str] frequency: The frequency that anomaly reports are sent. Valid Values: `DAILY` | `IMMEDIATE` | `WEEKLY`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] monitor_arn_lists: A list of cost anomaly monitors.
        :param pulumi.Input[str] name: The name for the subscription.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AnomalySubscriptionSubscriberArgs']]]] subscribers: A subscriber configuration. Multiple subscribers can be defined.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[pulumi.InputType['AnomalySubscriptionThresholdExpressionArgs']] threshold_expression: An Expression object used to specify the anomalies that you want to generate alerts for. See Threshold Expression.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AnomalySubscriptionState.__new__(_AnomalySubscriptionState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["arn"] = arn
        __props__.__dict__["frequency"] = frequency
        __props__.__dict__["monitor_arn_lists"] = monitor_arn_lists
        __props__.__dict__["name"] = name
        __props__.__dict__["subscribers"] = subscribers
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["threshold_expression"] = threshold_expression
        return AnomalySubscription(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The unique identifier for the AWS account in which the anomaly subscription ought to be created.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of the anomaly subscription.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def frequency(self) -> pulumi.Output[str]:
        """
        The frequency that anomaly reports are sent. Valid Values: `DAILY` | `IMMEDIATE` | `WEEKLY`.
        """
        return pulumi.get(self, "frequency")

    @property
    @pulumi.getter(name="monitorArnLists")
    def monitor_arn_lists(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of cost anomaly monitors.
        """
        return pulumi.get(self, "monitor_arn_lists")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name for the subscription.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def subscribers(self) -> pulumi.Output[Sequence['outputs.AnomalySubscriptionSubscriber']]:
        """
        A subscriber configuration. Multiple subscribers can be defined.
        """
        return pulumi.get(self, "subscribers")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter(name="thresholdExpression")
    def threshold_expression(self) -> pulumi.Output['outputs.AnomalySubscriptionThresholdExpression']:
        """
        An Expression object used to specify the anomalies that you want to generate alerts for. See Threshold Expression.
        """
        return pulumi.get(self, "threshold_expression")

