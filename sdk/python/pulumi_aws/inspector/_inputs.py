# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'AssessmentTemplateEventSubscriptionArgs',
]

@pulumi.input_type
class AssessmentTemplateEventSubscriptionArgs:
    def __init__(__self__, *,
                 event: pulumi.Input[str],
                 topic_arn: pulumi.Input[str]):
        """
        :param pulumi.Input[str] event: The event for which you want to receive SNS notifications. Valid values are `ASSESSMENT_RUN_STARTED`, `ASSESSMENT_RUN_COMPLETED`, `ASSESSMENT_RUN_STATE_CHANGED`, and `FINDING_REPORTED`.
        :param pulumi.Input[str] topic_arn: The ARN of the SNS topic to which notifications are sent.
        """
        pulumi.set(__self__, "event", event)
        pulumi.set(__self__, "topic_arn", topic_arn)

    @property
    @pulumi.getter
    def event(self) -> pulumi.Input[str]:
        """
        The event for which you want to receive SNS notifications. Valid values are `ASSESSMENT_RUN_STARTED`, `ASSESSMENT_RUN_COMPLETED`, `ASSESSMENT_RUN_STATE_CHANGED`, and `FINDING_REPORTED`.
        """
        return pulumi.get(self, "event")

    @event.setter
    def event(self, value: pulumi.Input[str]):
        pulumi.set(self, "event", value)

    @property
    @pulumi.getter(name="topicArn")
    def topic_arn(self) -> pulumi.Input[str]:
        """
        The ARN of the SNS topic to which notifications are sent.
        """
        return pulumi.get(self, "topic_arn")

    @topic_arn.setter
    def topic_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "topic_arn", value)


