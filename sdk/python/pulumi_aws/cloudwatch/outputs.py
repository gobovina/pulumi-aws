# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'EventPermissionCondition',
    'EventTargetBatchTarget',
    'EventTargetDeadLetterConfig',
    'EventTargetEcsTarget',
    'EventTargetEcsTargetNetworkConfiguration',
    'EventTargetInputTransformer',
    'EventTargetKinesisTarget',
    'EventTargetRetryPolicy',
    'EventTargetRunCommandTarget',
    'EventTargetSqsTarget',
    'LogMetricFilterMetricTransformation',
    'MetricAlarmMetricQuery',
    'MetricAlarmMetricQueryMetric',
]

@pulumi.output_type
class EventPermissionCondition(dict):
    def __init__(__self__, *,
                 key: str,
                 type: str,
                 value: str):
        """
        :param str key: Key for the condition. Valid values: `aws:PrincipalOrgID`.
        :param str type: Type of condition. Value values: `StringEquals`.
        :param str value: Value for the key.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> str:
        """
        Key for the condition. Valid values: `aws:PrincipalOrgID`.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Type of condition. Value values: `StringEquals`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        Value for the key.
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class EventTargetBatchTarget(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "jobDefinition":
            suggest = "job_definition"
        elif key == "jobName":
            suggest = "job_name"
        elif key == "arraySize":
            suggest = "array_size"
        elif key == "jobAttempts":
            suggest = "job_attempts"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in EventTargetBatchTarget. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        EventTargetBatchTarget.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        EventTargetBatchTarget.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 job_definition: str,
                 job_name: str,
                 array_size: Optional[int] = None,
                 job_attempts: Optional[int] = None):
        """
        :param str job_definition: The ARN or name of the job definition to use if the event target is an AWS Batch job. This job definition must already exist.
        :param str job_name: The name to use for this execution of the job, if the target is an AWS Batch job.
        :param int array_size: The size of the array, if this is an array batch job. Valid values are integers between 2 and 10,000.
        :param int job_attempts: The number of times to attempt to retry, if the job fails. Valid values are 1 to 10.
        """
        pulumi.set(__self__, "job_definition", job_definition)
        pulumi.set(__self__, "job_name", job_name)
        if array_size is not None:
            pulumi.set(__self__, "array_size", array_size)
        if job_attempts is not None:
            pulumi.set(__self__, "job_attempts", job_attempts)

    @property
    @pulumi.getter(name="jobDefinition")
    def job_definition(self) -> str:
        """
        The ARN or name of the job definition to use if the event target is an AWS Batch job. This job definition must already exist.
        """
        return pulumi.get(self, "job_definition")

    @property
    @pulumi.getter(name="jobName")
    def job_name(self) -> str:
        """
        The name to use for this execution of the job, if the target is an AWS Batch job.
        """
        return pulumi.get(self, "job_name")

    @property
    @pulumi.getter(name="arraySize")
    def array_size(self) -> Optional[int]:
        """
        The size of the array, if this is an array batch job. Valid values are integers between 2 and 10,000.
        """
        return pulumi.get(self, "array_size")

    @property
    @pulumi.getter(name="jobAttempts")
    def job_attempts(self) -> Optional[int]:
        """
        The number of times to attempt to retry, if the job fails. Valid values are 1 to 10.
        """
        return pulumi.get(self, "job_attempts")


@pulumi.output_type
class EventTargetDeadLetterConfig(dict):
    def __init__(__self__, *,
                 arn: Optional[str] = None):
        """
        :param str arn: - ARN of the SQS queue specified as the target for the dead-letter queue.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)

    @property
    @pulumi.getter
    def arn(self) -> Optional[str]:
        """
        - ARN of the SQS queue specified as the target for the dead-letter queue.
        """
        return pulumi.get(self, "arn")


@pulumi.output_type
class EventTargetEcsTarget(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "taskDefinitionArn":
            suggest = "task_definition_arn"
        elif key == "launchType":
            suggest = "launch_type"
        elif key == "networkConfiguration":
            suggest = "network_configuration"
        elif key == "platformVersion":
            suggest = "platform_version"
        elif key == "taskCount":
            suggest = "task_count"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in EventTargetEcsTarget. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        EventTargetEcsTarget.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        EventTargetEcsTarget.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 task_definition_arn: str,
                 group: Optional[str] = None,
                 launch_type: Optional[str] = None,
                 network_configuration: Optional['outputs.EventTargetEcsTargetNetworkConfiguration'] = None,
                 platform_version: Optional[str] = None,
                 task_count: Optional[int] = None):
        """
        :param str task_definition_arn: The ARN of the task definition to use if the event target is an Amazon ECS cluster.
        :param str group: Specifies an ECS task group for the task. The maximum length is 255 characters.
        :param str launch_type: Specifies the launch type on which your task is running. The launch type that you specify here must match one of the launch type (compatibilities) of the target task. Valid values are `EC2` or `FARGATE`.
        :param 'EventTargetEcsTargetNetworkConfigurationArgs' network_configuration: Use this if the ECS task uses the awsvpc network mode. This specifies the VPC subnets and security groups associated with the task, and whether a public IP address is to be used. Required if launch_type is FARGATE because the awsvpc mode is required for Fargate tasks.
        :param str platform_version: Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as 1.1.0. This is used only if LaunchType is FARGATE. For more information about valid platform versions, see [AWS Fargate Platform Versions](http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
        :param int task_count: The number of tasks to create based on the TaskDefinition. The default is 1.
        """
        pulumi.set(__self__, "task_definition_arn", task_definition_arn)
        if group is not None:
            pulumi.set(__self__, "group", group)
        if launch_type is not None:
            pulumi.set(__self__, "launch_type", launch_type)
        if network_configuration is not None:
            pulumi.set(__self__, "network_configuration", network_configuration)
        if platform_version is not None:
            pulumi.set(__self__, "platform_version", platform_version)
        if task_count is not None:
            pulumi.set(__self__, "task_count", task_count)

    @property
    @pulumi.getter(name="taskDefinitionArn")
    def task_definition_arn(self) -> str:
        """
        The ARN of the task definition to use if the event target is an Amazon ECS cluster.
        """
        return pulumi.get(self, "task_definition_arn")

    @property
    @pulumi.getter
    def group(self) -> Optional[str]:
        """
        Specifies an ECS task group for the task. The maximum length is 255 characters.
        """
        return pulumi.get(self, "group")

    @property
    @pulumi.getter(name="launchType")
    def launch_type(self) -> Optional[str]:
        """
        Specifies the launch type on which your task is running. The launch type that you specify here must match one of the launch type (compatibilities) of the target task. Valid values are `EC2` or `FARGATE`.
        """
        return pulumi.get(self, "launch_type")

    @property
    @pulumi.getter(name="networkConfiguration")
    def network_configuration(self) -> Optional['outputs.EventTargetEcsTargetNetworkConfiguration']:
        """
        Use this if the ECS task uses the awsvpc network mode. This specifies the VPC subnets and security groups associated with the task, and whether a public IP address is to be used. Required if launch_type is FARGATE because the awsvpc mode is required for Fargate tasks.
        """
        return pulumi.get(self, "network_configuration")

    @property
    @pulumi.getter(name="platformVersion")
    def platform_version(self) -> Optional[str]:
        """
        Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as 1.1.0. This is used only if LaunchType is FARGATE. For more information about valid platform versions, see [AWS Fargate Platform Versions](http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
        """
        return pulumi.get(self, "platform_version")

    @property
    @pulumi.getter(name="taskCount")
    def task_count(self) -> Optional[int]:
        """
        The number of tasks to create based on the TaskDefinition. The default is 1.
        """
        return pulumi.get(self, "task_count")


@pulumi.output_type
class EventTargetEcsTargetNetworkConfiguration(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "assignPublicIp":
            suggest = "assign_public_ip"
        elif key == "securityGroups":
            suggest = "security_groups"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in EventTargetEcsTargetNetworkConfiguration. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        EventTargetEcsTargetNetworkConfiguration.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        EventTargetEcsTargetNetworkConfiguration.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 subnets: Sequence[str],
                 assign_public_ip: Optional[bool] = None,
                 security_groups: Optional[Sequence[str]] = None):
        """
        :param Sequence[str] subnets: The subnets associated with the task or service.
        :param bool assign_public_ip: Assign a public IP address to the ENI (Fargate launch type only). Valid values are `true` or `false`. Default `false`.
        :param Sequence[str] security_groups: The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used.
        """
        pulumi.set(__self__, "subnets", subnets)
        if assign_public_ip is not None:
            pulumi.set(__self__, "assign_public_ip", assign_public_ip)
        if security_groups is not None:
            pulumi.set(__self__, "security_groups", security_groups)

    @property
    @pulumi.getter
    def subnets(self) -> Sequence[str]:
        """
        The subnets associated with the task or service.
        """
        return pulumi.get(self, "subnets")

    @property
    @pulumi.getter(name="assignPublicIp")
    def assign_public_ip(self) -> Optional[bool]:
        """
        Assign a public IP address to the ENI (Fargate launch type only). Valid values are `true` or `false`. Default `false`.
        """
        return pulumi.get(self, "assign_public_ip")

    @property
    @pulumi.getter(name="securityGroups")
    def security_groups(self) -> Optional[Sequence[str]]:
        """
        The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used.
        """
        return pulumi.get(self, "security_groups")


@pulumi.output_type
class EventTargetInputTransformer(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "inputTemplate":
            suggest = "input_template"
        elif key == "inputPaths":
            suggest = "input_paths"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in EventTargetInputTransformer. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        EventTargetInputTransformer.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        EventTargetInputTransformer.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 input_template: str,
                 input_paths: Optional[Mapping[str, str]] = None):
        """
        :param str input_template: Template to customize data sent to the target. Must be valid JSON. To send a string value, the string value must include double quotes. Values must be escaped for both JSON and the provider, e.g. `"\"Your string goes here.\\nA new line.\""`
        :param Mapping[str, str] input_paths: Key value pairs specified in the form of JSONPath (for example, time = $.time)
               * You can have as many as 10 key-value pairs.
               * You must use JSON dot notation, not bracket notation.
               * The keys can't start with "AWS".
        """
        pulumi.set(__self__, "input_template", input_template)
        if input_paths is not None:
            pulumi.set(__self__, "input_paths", input_paths)

    @property
    @pulumi.getter(name="inputTemplate")
    def input_template(self) -> str:
        """
        Template to customize data sent to the target. Must be valid JSON. To send a string value, the string value must include double quotes. Values must be escaped for both JSON and the provider, e.g. `"\"Your string goes here.\\nA new line.\""`
        """
        return pulumi.get(self, "input_template")

    @property
    @pulumi.getter(name="inputPaths")
    def input_paths(self) -> Optional[Mapping[str, str]]:
        """
        Key value pairs specified in the form of JSONPath (for example, time = $.time)
        * You can have as many as 10 key-value pairs.
        * You must use JSON dot notation, not bracket notation.
        * The keys can't start with "AWS".
        """
        return pulumi.get(self, "input_paths")


@pulumi.output_type
class EventTargetKinesisTarget(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "partitionKeyPath":
            suggest = "partition_key_path"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in EventTargetKinesisTarget. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        EventTargetKinesisTarget.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        EventTargetKinesisTarget.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 partition_key_path: Optional[str] = None):
        """
        :param str partition_key_path: The JSON path to be extracted from the event and used as the partition key.
        """
        if partition_key_path is not None:
            pulumi.set(__self__, "partition_key_path", partition_key_path)

    @property
    @pulumi.getter(name="partitionKeyPath")
    def partition_key_path(self) -> Optional[str]:
        """
        The JSON path to be extracted from the event and used as the partition key.
        """
        return pulumi.get(self, "partition_key_path")


@pulumi.output_type
class EventTargetRetryPolicy(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "maximumEventAgeInSeconds":
            suggest = "maximum_event_age_in_seconds"
        elif key == "maximumRetryAttempts":
            suggest = "maximum_retry_attempts"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in EventTargetRetryPolicy. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        EventTargetRetryPolicy.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        EventTargetRetryPolicy.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 maximum_event_age_in_seconds: Optional[int] = None,
                 maximum_retry_attempts: Optional[int] = None):
        """
        :param int maximum_event_age_in_seconds: The age in seconds to continue to make retry attempts.
        :param int maximum_retry_attempts: maximum number of retry attempts to make before the request fails
        """
        if maximum_event_age_in_seconds is not None:
            pulumi.set(__self__, "maximum_event_age_in_seconds", maximum_event_age_in_seconds)
        if maximum_retry_attempts is not None:
            pulumi.set(__self__, "maximum_retry_attempts", maximum_retry_attempts)

    @property
    @pulumi.getter(name="maximumEventAgeInSeconds")
    def maximum_event_age_in_seconds(self) -> Optional[int]:
        """
        The age in seconds to continue to make retry attempts.
        """
        return pulumi.get(self, "maximum_event_age_in_seconds")

    @property
    @pulumi.getter(name="maximumRetryAttempts")
    def maximum_retry_attempts(self) -> Optional[int]:
        """
        maximum number of retry attempts to make before the request fails
        """
        return pulumi.get(self, "maximum_retry_attempts")


@pulumi.output_type
class EventTargetRunCommandTarget(dict):
    def __init__(__self__, *,
                 key: str,
                 values: Sequence[str]):
        """
        :param str key: Can be either `tag:tag-key` or `InstanceIds`.
        :param Sequence[str] values: If Key is `tag:tag-key`, Values is a list of tag values. If Key is `InstanceIds`, Values is a list of Amazon EC2 instance IDs.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def key(self) -> str:
        """
        Can be either `tag:tag-key` or `InstanceIds`.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        """
        If Key is `tag:tag-key`, Values is a list of tag values. If Key is `InstanceIds`, Values is a list of Amazon EC2 instance IDs.
        """
        return pulumi.get(self, "values")


@pulumi.output_type
class EventTargetSqsTarget(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "messageGroupId":
            suggest = "message_group_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in EventTargetSqsTarget. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        EventTargetSqsTarget.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        EventTargetSqsTarget.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 message_group_id: Optional[str] = None):
        """
        :param str message_group_id: The FIFO message group ID to use as the target.
        """
        if message_group_id is not None:
            pulumi.set(__self__, "message_group_id", message_group_id)

    @property
    @pulumi.getter(name="messageGroupId")
    def message_group_id(self) -> Optional[str]:
        """
        The FIFO message group ID to use as the target.
        """
        return pulumi.get(self, "message_group_id")


@pulumi.output_type
class LogMetricFilterMetricTransformation(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "defaultValue":
            suggest = "default_value"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in LogMetricFilterMetricTransformation. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        LogMetricFilterMetricTransformation.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        LogMetricFilterMetricTransformation.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: str,
                 namespace: str,
                 value: str,
                 default_value: Optional[str] = None):
        """
        :param str name: The name of the CloudWatch metric to which the monitored log information should be published (e.g. `ErrorCount`)
        :param str namespace: The destination namespace of the CloudWatch metric.
        :param str value: What to publish to the metric. For example, if you're counting the occurrences of a particular term like "Error", the value will be "1" for each occurrence. If you're counting the bytes transferred the published value will be the value in the log event.
        :param str default_value: The value to emit when a filter pattern does not match a log event.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "namespace", namespace)
        pulumi.set(__self__, "value", value)
        if default_value is not None:
            pulumi.set(__self__, "default_value", default_value)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the CloudWatch metric to which the monitored log information should be published (e.g. `ErrorCount`)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def namespace(self) -> str:
        """
        The destination namespace of the CloudWatch metric.
        """
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        What to publish to the metric. For example, if you're counting the occurrences of a particular term like "Error", the value will be "1" for each occurrence. If you're counting the bytes transferred the published value will be the value in the log event.
        """
        return pulumi.get(self, "value")

    @property
    @pulumi.getter(name="defaultValue")
    def default_value(self) -> Optional[str]:
        """
        The value to emit when a filter pattern does not match a log event.
        """
        return pulumi.get(self, "default_value")


@pulumi.output_type
class MetricAlarmMetricQuery(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "returnData":
            suggest = "return_data"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in MetricAlarmMetricQuery. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        MetricAlarmMetricQuery.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        MetricAlarmMetricQuery.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 id: str,
                 expression: Optional[str] = None,
                 label: Optional[str] = None,
                 metric: Optional['outputs.MetricAlarmMetricQueryMetric'] = None,
                 return_data: Optional[bool] = None):
        """
        :param str id: A short name used to tie this object to the results in the response. If you are performing math expressions on this set of data, this name represents that data and can serve as a variable in the mathematical expression. The valid characters are letters, numbers, and underscore. The first character must be a lowercase letter.
        :param str expression: The math expression to be performed on the returned data, if this object is performing a math expression. This expression can use the id of the other metrics to refer to those metrics, and can also use the id of other expressions to use the result of those expressions. For more information about metric math expressions, see Metric Math Syntax and Functions in the [Amazon CloudWatch User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax).
        :param str label: A human-readable label for this metric or expression. This is especially useful if this is an expression, so that you know what the value represents.
        :param 'MetricAlarmMetricQueryMetricArgs' metric: The metric to be returned, along with statistics, period, and units. Use this parameter only if this object is retrieving a metric and not performing a math expression on returned data.
        :param bool return_data: Specify exactly one `metric_query` to be `true` to use that `metric_query` result as the alarm.
        """
        pulumi.set(__self__, "id", id)
        if expression is not None:
            pulumi.set(__self__, "expression", expression)
        if label is not None:
            pulumi.set(__self__, "label", label)
        if metric is not None:
            pulumi.set(__self__, "metric", metric)
        if return_data is not None:
            pulumi.set(__self__, "return_data", return_data)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        A short name used to tie this object to the results in the response. If you are performing math expressions on this set of data, this name represents that data and can serve as a variable in the mathematical expression. The valid characters are letters, numbers, and underscore. The first character must be a lowercase letter.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def expression(self) -> Optional[str]:
        """
        The math expression to be performed on the returned data, if this object is performing a math expression. This expression can use the id of the other metrics to refer to those metrics, and can also use the id of other expressions to use the result of those expressions. For more information about metric math expressions, see Metric Math Syntax and Functions in the [Amazon CloudWatch User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax).
        """
        return pulumi.get(self, "expression")

    @property
    @pulumi.getter
    def label(self) -> Optional[str]:
        """
        A human-readable label for this metric or expression. This is especially useful if this is an expression, so that you know what the value represents.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def metric(self) -> Optional['outputs.MetricAlarmMetricQueryMetric']:
        """
        The metric to be returned, along with statistics, period, and units. Use this parameter only if this object is retrieving a metric and not performing a math expression on returned data.
        """
        return pulumi.get(self, "metric")

    @property
    @pulumi.getter(name="returnData")
    def return_data(self) -> Optional[bool]:
        """
        Specify exactly one `metric_query` to be `true` to use that `metric_query` result as the alarm.
        """
        return pulumi.get(self, "return_data")


@pulumi.output_type
class MetricAlarmMetricQueryMetric(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "metricName":
            suggest = "metric_name"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in MetricAlarmMetricQueryMetric. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        MetricAlarmMetricQueryMetric.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        MetricAlarmMetricQueryMetric.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 metric_name: str,
                 period: int,
                 stat: str,
                 dimensions: Optional[Mapping[str, str]] = None,
                 namespace: Optional[str] = None,
                 unit: Optional[str] = None):
        """
        :param str metric_name: The name for this metric.
               See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
        :param int period: The period in seconds over which the specified `stat` is applied.
        :param str stat: The statistic to apply to this metric.
               Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
        :param Mapping[str, str] dimensions: The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
        :param str namespace: The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
               See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
        :param str unit: The unit for this metric.
        """
        pulumi.set(__self__, "metric_name", metric_name)
        pulumi.set(__self__, "period", period)
        pulumi.set(__self__, "stat", stat)
        if dimensions is not None:
            pulumi.set(__self__, "dimensions", dimensions)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if unit is not None:
            pulumi.set(__self__, "unit", unit)

    @property
    @pulumi.getter(name="metricName")
    def metric_name(self) -> str:
        """
        The name for this metric.
        See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
        """
        return pulumi.get(self, "metric_name")

    @property
    @pulumi.getter
    def period(self) -> int:
        """
        The period in seconds over which the specified `stat` is applied.
        """
        return pulumi.get(self, "period")

    @property
    @pulumi.getter
    def stat(self) -> str:
        """
        The statistic to apply to this metric.
        Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
        """
        return pulumi.get(self, "stat")

    @property
    @pulumi.getter
    def dimensions(self) -> Optional[Mapping[str, str]]:
        """
        The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
        """
        return pulumi.get(self, "dimensions")

    @property
    @pulumi.getter
    def namespace(self) -> Optional[str]:
        """
        The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
        See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
        """
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter
    def unit(self) -> Optional[str]:
        """
        The unit for this metric.
        """
        return pulumi.get(self, "unit")


