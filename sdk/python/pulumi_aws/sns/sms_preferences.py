# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SmsPreferencesArgs', 'SmsPreferences']

@pulumi.input_type
class SmsPreferencesArgs:
    def __init__(__self__, *,
                 default_sender_id: Optional[pulumi.Input[str]] = None,
                 default_sms_type: Optional[pulumi.Input[str]] = None,
                 delivery_status_iam_role_arn: Optional[pulumi.Input[str]] = None,
                 delivery_status_success_sampling_rate: Optional[pulumi.Input[str]] = None,
                 monthly_spend_limit: Optional[pulumi.Input[int]] = None,
                 usage_report_s3_bucket: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SmsPreferences resource.
        :param pulumi.Input[str] default_sender_id: A string, such as your business brand, that is displayed as the sender on the receiving device.
        :param pulumi.Input[str] default_sms_type: The type of SMS message that you will send by default. Possible values are: Promotional, Transactional
        :param pulumi.Input[str] delivery_status_iam_role_arn: The ARN of the IAM role that allows Amazon SNS to write logs about SMS deliveries in CloudWatch Logs.
        :param pulumi.Input[str] delivery_status_success_sampling_rate: The percentage of successful SMS deliveries for which Amazon SNS will write logs in CloudWatch Logs. The value must be between 0 and 100.
        :param pulumi.Input[int] monthly_spend_limit: The maximum amount in USD that you are willing to spend each month to send SMS messages.
        :param pulumi.Input[str] usage_report_s3_bucket: The name of the Amazon S3 bucket to receive daily SMS usage reports from Amazon SNS.
        """
        if default_sender_id is not None:
            pulumi.set(__self__, "default_sender_id", default_sender_id)
        if default_sms_type is not None:
            pulumi.set(__self__, "default_sms_type", default_sms_type)
        if delivery_status_iam_role_arn is not None:
            pulumi.set(__self__, "delivery_status_iam_role_arn", delivery_status_iam_role_arn)
        if delivery_status_success_sampling_rate is not None:
            pulumi.set(__self__, "delivery_status_success_sampling_rate", delivery_status_success_sampling_rate)
        if monthly_spend_limit is not None:
            pulumi.set(__self__, "monthly_spend_limit", monthly_spend_limit)
        if usage_report_s3_bucket is not None:
            pulumi.set(__self__, "usage_report_s3_bucket", usage_report_s3_bucket)

    @property
    @pulumi.getter(name="defaultSenderId")
    def default_sender_id(self) -> Optional[pulumi.Input[str]]:
        """
        A string, such as your business brand, that is displayed as the sender on the receiving device.
        """
        return pulumi.get(self, "default_sender_id")

    @default_sender_id.setter
    def default_sender_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_sender_id", value)

    @property
    @pulumi.getter(name="defaultSmsType")
    def default_sms_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of SMS message that you will send by default. Possible values are: Promotional, Transactional
        """
        return pulumi.get(self, "default_sms_type")

    @default_sms_type.setter
    def default_sms_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_sms_type", value)

    @property
    @pulumi.getter(name="deliveryStatusIamRoleArn")
    def delivery_status_iam_role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the IAM role that allows Amazon SNS to write logs about SMS deliveries in CloudWatch Logs.
        """
        return pulumi.get(self, "delivery_status_iam_role_arn")

    @delivery_status_iam_role_arn.setter
    def delivery_status_iam_role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delivery_status_iam_role_arn", value)

    @property
    @pulumi.getter(name="deliveryStatusSuccessSamplingRate")
    def delivery_status_success_sampling_rate(self) -> Optional[pulumi.Input[str]]:
        """
        The percentage of successful SMS deliveries for which Amazon SNS will write logs in CloudWatch Logs. The value must be between 0 and 100.
        """
        return pulumi.get(self, "delivery_status_success_sampling_rate")

    @delivery_status_success_sampling_rate.setter
    def delivery_status_success_sampling_rate(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delivery_status_success_sampling_rate", value)

    @property
    @pulumi.getter(name="monthlySpendLimit")
    def monthly_spend_limit(self) -> Optional[pulumi.Input[int]]:
        """
        The maximum amount in USD that you are willing to spend each month to send SMS messages.
        """
        return pulumi.get(self, "monthly_spend_limit")

    @monthly_spend_limit.setter
    def monthly_spend_limit(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "monthly_spend_limit", value)

    @property
    @pulumi.getter(name="usageReportS3Bucket")
    def usage_report_s3_bucket(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Amazon S3 bucket to receive daily SMS usage reports from Amazon SNS.
        """
        return pulumi.get(self, "usage_report_s3_bucket")

    @usage_report_s3_bucket.setter
    def usage_report_s3_bucket(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "usage_report_s3_bucket", value)


@pulumi.input_type
class _SmsPreferencesState:
    def __init__(__self__, *,
                 default_sender_id: Optional[pulumi.Input[str]] = None,
                 default_sms_type: Optional[pulumi.Input[str]] = None,
                 delivery_status_iam_role_arn: Optional[pulumi.Input[str]] = None,
                 delivery_status_success_sampling_rate: Optional[pulumi.Input[str]] = None,
                 monthly_spend_limit: Optional[pulumi.Input[int]] = None,
                 usage_report_s3_bucket: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SmsPreferences resources.
        :param pulumi.Input[str] default_sender_id: A string, such as your business brand, that is displayed as the sender on the receiving device.
        :param pulumi.Input[str] default_sms_type: The type of SMS message that you will send by default. Possible values are: Promotional, Transactional
        :param pulumi.Input[str] delivery_status_iam_role_arn: The ARN of the IAM role that allows Amazon SNS to write logs about SMS deliveries in CloudWatch Logs.
        :param pulumi.Input[str] delivery_status_success_sampling_rate: The percentage of successful SMS deliveries for which Amazon SNS will write logs in CloudWatch Logs. The value must be between 0 and 100.
        :param pulumi.Input[int] monthly_spend_limit: The maximum amount in USD that you are willing to spend each month to send SMS messages.
        :param pulumi.Input[str] usage_report_s3_bucket: The name of the Amazon S3 bucket to receive daily SMS usage reports from Amazon SNS.
        """
        if default_sender_id is not None:
            pulumi.set(__self__, "default_sender_id", default_sender_id)
        if default_sms_type is not None:
            pulumi.set(__self__, "default_sms_type", default_sms_type)
        if delivery_status_iam_role_arn is not None:
            pulumi.set(__self__, "delivery_status_iam_role_arn", delivery_status_iam_role_arn)
        if delivery_status_success_sampling_rate is not None:
            pulumi.set(__self__, "delivery_status_success_sampling_rate", delivery_status_success_sampling_rate)
        if monthly_spend_limit is not None:
            pulumi.set(__self__, "monthly_spend_limit", monthly_spend_limit)
        if usage_report_s3_bucket is not None:
            pulumi.set(__self__, "usage_report_s3_bucket", usage_report_s3_bucket)

    @property
    @pulumi.getter(name="defaultSenderId")
    def default_sender_id(self) -> Optional[pulumi.Input[str]]:
        """
        A string, such as your business brand, that is displayed as the sender on the receiving device.
        """
        return pulumi.get(self, "default_sender_id")

    @default_sender_id.setter
    def default_sender_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_sender_id", value)

    @property
    @pulumi.getter(name="defaultSmsType")
    def default_sms_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of SMS message that you will send by default. Possible values are: Promotional, Transactional
        """
        return pulumi.get(self, "default_sms_type")

    @default_sms_type.setter
    def default_sms_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_sms_type", value)

    @property
    @pulumi.getter(name="deliveryStatusIamRoleArn")
    def delivery_status_iam_role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the IAM role that allows Amazon SNS to write logs about SMS deliveries in CloudWatch Logs.
        """
        return pulumi.get(self, "delivery_status_iam_role_arn")

    @delivery_status_iam_role_arn.setter
    def delivery_status_iam_role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delivery_status_iam_role_arn", value)

    @property
    @pulumi.getter(name="deliveryStatusSuccessSamplingRate")
    def delivery_status_success_sampling_rate(self) -> Optional[pulumi.Input[str]]:
        """
        The percentage of successful SMS deliveries for which Amazon SNS will write logs in CloudWatch Logs. The value must be between 0 and 100.
        """
        return pulumi.get(self, "delivery_status_success_sampling_rate")

    @delivery_status_success_sampling_rate.setter
    def delivery_status_success_sampling_rate(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delivery_status_success_sampling_rate", value)

    @property
    @pulumi.getter(name="monthlySpendLimit")
    def monthly_spend_limit(self) -> Optional[pulumi.Input[int]]:
        """
        The maximum amount in USD that you are willing to spend each month to send SMS messages.
        """
        return pulumi.get(self, "monthly_spend_limit")

    @monthly_spend_limit.setter
    def monthly_spend_limit(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "monthly_spend_limit", value)

    @property
    @pulumi.getter(name="usageReportS3Bucket")
    def usage_report_s3_bucket(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Amazon S3 bucket to receive daily SMS usage reports from Amazon SNS.
        """
        return pulumi.get(self, "usage_report_s3_bucket")

    @usage_report_s3_bucket.setter
    def usage_report_s3_bucket(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "usage_report_s3_bucket", value)


class SmsPreferences(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_sender_id: Optional[pulumi.Input[str]] = None,
                 default_sms_type: Optional[pulumi.Input[str]] = None,
                 delivery_status_iam_role_arn: Optional[pulumi.Input[str]] = None,
                 delivery_status_success_sampling_rate: Optional[pulumi.Input[str]] = None,
                 monthly_spend_limit: Optional[pulumi.Input[int]] = None,
                 usage_report_s3_bucket: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a way to set SNS SMS preferences.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        update_sms_prefs = aws.sns.SmsPreferences("update_sms_prefs")
        ```

        ## Import

        You cannot import the SMS preferences.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] default_sender_id: A string, such as your business brand, that is displayed as the sender on the receiving device.
        :param pulumi.Input[str] default_sms_type: The type of SMS message that you will send by default. Possible values are: Promotional, Transactional
        :param pulumi.Input[str] delivery_status_iam_role_arn: The ARN of the IAM role that allows Amazon SNS to write logs about SMS deliveries in CloudWatch Logs.
        :param pulumi.Input[str] delivery_status_success_sampling_rate: The percentage of successful SMS deliveries for which Amazon SNS will write logs in CloudWatch Logs. The value must be between 0 and 100.
        :param pulumi.Input[int] monthly_spend_limit: The maximum amount in USD that you are willing to spend each month to send SMS messages.
        :param pulumi.Input[str] usage_report_s3_bucket: The name of the Amazon S3 bucket to receive daily SMS usage reports from Amazon SNS.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[SmsPreferencesArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a way to set SNS SMS preferences.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        update_sms_prefs = aws.sns.SmsPreferences("update_sms_prefs")
        ```

        ## Import

        You cannot import the SMS preferences.

        :param str resource_name: The name of the resource.
        :param SmsPreferencesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SmsPreferencesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_sender_id: Optional[pulumi.Input[str]] = None,
                 default_sms_type: Optional[pulumi.Input[str]] = None,
                 delivery_status_iam_role_arn: Optional[pulumi.Input[str]] = None,
                 delivery_status_success_sampling_rate: Optional[pulumi.Input[str]] = None,
                 monthly_spend_limit: Optional[pulumi.Input[int]] = None,
                 usage_report_s3_bucket: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SmsPreferencesArgs.__new__(SmsPreferencesArgs)

            __props__.__dict__["default_sender_id"] = default_sender_id
            __props__.__dict__["default_sms_type"] = default_sms_type
            __props__.__dict__["delivery_status_iam_role_arn"] = delivery_status_iam_role_arn
            __props__.__dict__["delivery_status_success_sampling_rate"] = delivery_status_success_sampling_rate
            __props__.__dict__["monthly_spend_limit"] = monthly_spend_limit
            __props__.__dict__["usage_report_s3_bucket"] = usage_report_s3_bucket
        super(SmsPreferences, __self__).__init__(
            'aws:sns/smsPreferences:SmsPreferences',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            default_sender_id: Optional[pulumi.Input[str]] = None,
            default_sms_type: Optional[pulumi.Input[str]] = None,
            delivery_status_iam_role_arn: Optional[pulumi.Input[str]] = None,
            delivery_status_success_sampling_rate: Optional[pulumi.Input[str]] = None,
            monthly_spend_limit: Optional[pulumi.Input[int]] = None,
            usage_report_s3_bucket: Optional[pulumi.Input[str]] = None) -> 'SmsPreferences':
        """
        Get an existing SmsPreferences resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] default_sender_id: A string, such as your business brand, that is displayed as the sender on the receiving device.
        :param pulumi.Input[str] default_sms_type: The type of SMS message that you will send by default. Possible values are: Promotional, Transactional
        :param pulumi.Input[str] delivery_status_iam_role_arn: The ARN of the IAM role that allows Amazon SNS to write logs about SMS deliveries in CloudWatch Logs.
        :param pulumi.Input[str] delivery_status_success_sampling_rate: The percentage of successful SMS deliveries for which Amazon SNS will write logs in CloudWatch Logs. The value must be between 0 and 100.
        :param pulumi.Input[int] monthly_spend_limit: The maximum amount in USD that you are willing to spend each month to send SMS messages.
        :param pulumi.Input[str] usage_report_s3_bucket: The name of the Amazon S3 bucket to receive daily SMS usage reports from Amazon SNS.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SmsPreferencesState.__new__(_SmsPreferencesState)

        __props__.__dict__["default_sender_id"] = default_sender_id
        __props__.__dict__["default_sms_type"] = default_sms_type
        __props__.__dict__["delivery_status_iam_role_arn"] = delivery_status_iam_role_arn
        __props__.__dict__["delivery_status_success_sampling_rate"] = delivery_status_success_sampling_rate
        __props__.__dict__["monthly_spend_limit"] = monthly_spend_limit
        __props__.__dict__["usage_report_s3_bucket"] = usage_report_s3_bucket
        return SmsPreferences(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="defaultSenderId")
    def default_sender_id(self) -> pulumi.Output[Optional[str]]:
        """
        A string, such as your business brand, that is displayed as the sender on the receiving device.
        """
        return pulumi.get(self, "default_sender_id")

    @property
    @pulumi.getter(name="defaultSmsType")
    def default_sms_type(self) -> pulumi.Output[Optional[str]]:
        """
        The type of SMS message that you will send by default. Possible values are: Promotional, Transactional
        """
        return pulumi.get(self, "default_sms_type")

    @property
    @pulumi.getter(name="deliveryStatusIamRoleArn")
    def delivery_status_iam_role_arn(self) -> pulumi.Output[Optional[str]]:
        """
        The ARN of the IAM role that allows Amazon SNS to write logs about SMS deliveries in CloudWatch Logs.
        """
        return pulumi.get(self, "delivery_status_iam_role_arn")

    @property
    @pulumi.getter(name="deliveryStatusSuccessSamplingRate")
    def delivery_status_success_sampling_rate(self) -> pulumi.Output[Optional[str]]:
        """
        The percentage of successful SMS deliveries for which Amazon SNS will write logs in CloudWatch Logs. The value must be between 0 and 100.
        """
        return pulumi.get(self, "delivery_status_success_sampling_rate")

    @property
    @pulumi.getter(name="monthlySpendLimit")
    def monthly_spend_limit(self) -> pulumi.Output[int]:
        """
        The maximum amount in USD that you are willing to spend each month to send SMS messages.
        """
        return pulumi.get(self, "monthly_spend_limit")

    @property
    @pulumi.getter(name="usageReportS3Bucket")
    def usage_report_s3_bucket(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the Amazon S3 bucket to receive daily SMS usage reports from Amazon SNS.
        """
        return pulumi.get(self, "usage_report_s3_bucket")

