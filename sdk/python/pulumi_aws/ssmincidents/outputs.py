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

__all__ = [
    'ReplicationSetRegion',
    'ResponsePlanAction',
    'ResponsePlanActionSsmAutomation',
    'ResponsePlanActionSsmAutomationParameter',
    'ResponsePlanIncidentTemplate',
    'ResponsePlanIncidentTemplateNotificationTarget',
    'ResponsePlanIntegration',
    'ResponsePlanIntegrationPagerduty',
    'GetReplicationSetRegionResult',
    'GetResponsePlanActionResult',
    'GetResponsePlanActionSsmAutomationResult',
    'GetResponsePlanActionSsmAutomationParameterResult',
    'GetResponsePlanIncidentTemplateResult',
    'GetResponsePlanIncidentTemplateNotificationTargetResult',
    'GetResponsePlanIntegrationResult',
    'GetResponsePlanIntegrationPagerdutyResult',
]

@pulumi.output_type
class ReplicationSetRegion(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "kmsKeyArn":
            suggest = "kms_key_arn"
        elif key == "statusMessage":
            suggest = "status_message"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ReplicationSetRegion. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ReplicationSetRegion.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ReplicationSetRegion.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: str,
                 kms_key_arn: Optional[str] = None,
                 status: Optional[str] = None,
                 status_message: Optional[str] = None):
        """
        :param str name: The name of the Region, such as `ap-southeast-2`.
        :param str kms_key_arn: The Amazon Resource name (ARN) of the customer managed key. If omitted, AWS manages the AWS KMS keys for you, using an AWS owned key, as indicated by a default value of `DefaultKey`.
               
               The following arguments are optional:
        :param str status: The current status of the Region.
               * Valid Values: `ACTIVE` | `CREATING` | `UPDATING` | `DELETING` | `FAILED`
        :param str status_message: More information about the status of a Region.
        """
        pulumi.set(__self__, "name", name)
        if kms_key_arn is not None:
            pulumi.set(__self__, "kms_key_arn", kms_key_arn)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if status_message is not None:
            pulumi.set(__self__, "status_message", status_message)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the Region, such as `ap-southeast-2`.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="kmsKeyArn")
    def kms_key_arn(self) -> Optional[str]:
        """
        The Amazon Resource name (ARN) of the customer managed key. If omitted, AWS manages the AWS KMS keys for you, using an AWS owned key, as indicated by a default value of `DefaultKey`.

        The following arguments are optional:
        """
        return pulumi.get(self, "kms_key_arn")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        The current status of the Region.
        * Valid Values: `ACTIVE` | `CREATING` | `UPDATING` | `DELETING` | `FAILED`
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="statusMessage")
    def status_message(self) -> Optional[str]:
        """
        More information about the status of a Region.
        """
        return pulumi.get(self, "status_message")


@pulumi.output_type
class ResponsePlanAction(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "ssmAutomations":
            suggest = "ssm_automations"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ResponsePlanAction. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ResponsePlanAction.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ResponsePlanAction.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 ssm_automations: Optional[Sequence['outputs.ResponsePlanActionSsmAutomation']] = None):
        if ssm_automations is not None:
            pulumi.set(__self__, "ssm_automations", ssm_automations)

    @property
    @pulumi.getter(name="ssmAutomations")
    def ssm_automations(self) -> Optional[Sequence['outputs.ResponsePlanActionSsmAutomation']]:
        return pulumi.get(self, "ssm_automations")


@pulumi.output_type
class ResponsePlanActionSsmAutomation(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "documentName":
            suggest = "document_name"
        elif key == "roleArn":
            suggest = "role_arn"
        elif key == "documentVersion":
            suggest = "document_version"
        elif key == "dynamicParameters":
            suggest = "dynamic_parameters"
        elif key == "targetAccount":
            suggest = "target_account"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ResponsePlanActionSsmAutomation. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ResponsePlanActionSsmAutomation.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ResponsePlanActionSsmAutomation.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 document_name: str,
                 role_arn: str,
                 document_version: Optional[str] = None,
                 dynamic_parameters: Optional[Mapping[str, str]] = None,
                 parameters: Optional[Sequence['outputs.ResponsePlanActionSsmAutomationParameter']] = None,
                 target_account: Optional[str] = None):
        pulumi.set(__self__, "document_name", document_name)
        pulumi.set(__self__, "role_arn", role_arn)
        if document_version is not None:
            pulumi.set(__self__, "document_version", document_version)
        if dynamic_parameters is not None:
            pulumi.set(__self__, "dynamic_parameters", dynamic_parameters)
        if parameters is not None:
            pulumi.set(__self__, "parameters", parameters)
        if target_account is not None:
            pulumi.set(__self__, "target_account", target_account)

    @property
    @pulumi.getter(name="documentName")
    def document_name(self) -> str:
        return pulumi.get(self, "document_name")

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> str:
        return pulumi.get(self, "role_arn")

    @property
    @pulumi.getter(name="documentVersion")
    def document_version(self) -> Optional[str]:
        return pulumi.get(self, "document_version")

    @property
    @pulumi.getter(name="dynamicParameters")
    def dynamic_parameters(self) -> Optional[Mapping[str, str]]:
        return pulumi.get(self, "dynamic_parameters")

    @property
    @pulumi.getter
    def parameters(self) -> Optional[Sequence['outputs.ResponsePlanActionSsmAutomationParameter']]:
        return pulumi.get(self, "parameters")

    @property
    @pulumi.getter(name="targetAccount")
    def target_account(self) -> Optional[str]:
        return pulumi.get(self, "target_account")


@pulumi.output_type
class ResponsePlanActionSsmAutomationParameter(dict):
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        """
        :param str name: The name of the response plan.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the response plan.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")


@pulumi.output_type
class ResponsePlanIncidentTemplate(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "dedupeString":
            suggest = "dedupe_string"
        elif key == "incidentTags":
            suggest = "incident_tags"
        elif key == "notificationTargets":
            suggest = "notification_targets"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ResponsePlanIncidentTemplate. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ResponsePlanIncidentTemplate.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ResponsePlanIncidentTemplate.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 impact: int,
                 title: str,
                 dedupe_string: Optional[str] = None,
                 incident_tags: Optional[Mapping[str, str]] = None,
                 notification_targets: Optional[Sequence['outputs.ResponsePlanIncidentTemplateNotificationTarget']] = None,
                 summary: Optional[str] = None):
        """
        :param int impact: The impact value of a generated incident. The following values are supported:
        :param str title: The title of a generated incident.
        :param str dedupe_string: A string used to stop Incident Manager from creating multiple incident records for the same incident.
        :param Mapping[str, str] incident_tags: The tags assigned to an incident template. When an incident starts, Incident Manager assigns the tags specified in the template to the incident.
        :param Sequence['ResponsePlanIncidentTemplateNotificationTargetArgs'] notification_targets: The Amazon Simple Notification Service (Amazon SNS) targets that this incident notifies when it is updated. The `notification_target` configuration block supports the following argument:
        :param str summary: The summary of an incident.
        """
        pulumi.set(__self__, "impact", impact)
        pulumi.set(__self__, "title", title)
        if dedupe_string is not None:
            pulumi.set(__self__, "dedupe_string", dedupe_string)
        if incident_tags is not None:
            pulumi.set(__self__, "incident_tags", incident_tags)
        if notification_targets is not None:
            pulumi.set(__self__, "notification_targets", notification_targets)
        if summary is not None:
            pulumi.set(__self__, "summary", summary)

    @property
    @pulumi.getter
    def impact(self) -> int:
        """
        The impact value of a generated incident. The following values are supported:
        """
        return pulumi.get(self, "impact")

    @property
    @pulumi.getter
    def title(self) -> str:
        """
        The title of a generated incident.
        """
        return pulumi.get(self, "title")

    @property
    @pulumi.getter(name="dedupeString")
    def dedupe_string(self) -> Optional[str]:
        """
        A string used to stop Incident Manager from creating multiple incident records for the same incident.
        """
        return pulumi.get(self, "dedupe_string")

    @property
    @pulumi.getter(name="incidentTags")
    def incident_tags(self) -> Optional[Mapping[str, str]]:
        """
        The tags assigned to an incident template. When an incident starts, Incident Manager assigns the tags specified in the template to the incident.
        """
        return pulumi.get(self, "incident_tags")

    @property
    @pulumi.getter(name="notificationTargets")
    def notification_targets(self) -> Optional[Sequence['outputs.ResponsePlanIncidentTemplateNotificationTarget']]:
        """
        The Amazon Simple Notification Service (Amazon SNS) targets that this incident notifies when it is updated. The `notification_target` configuration block supports the following argument:
        """
        return pulumi.get(self, "notification_targets")

    @property
    @pulumi.getter
    def summary(self) -> Optional[str]:
        """
        The summary of an incident.
        """
        return pulumi.get(self, "summary")


@pulumi.output_type
class ResponsePlanIncidentTemplateNotificationTarget(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "snsTopicArn":
            suggest = "sns_topic_arn"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ResponsePlanIncidentTemplateNotificationTarget. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ResponsePlanIncidentTemplateNotificationTarget.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ResponsePlanIncidentTemplateNotificationTarget.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 sns_topic_arn: str):
        """
        :param str sns_topic_arn: The ARN of the Amazon SNS topic.
               
               The following arguments are optional:
        """
        pulumi.set(__self__, "sns_topic_arn", sns_topic_arn)

    @property
    @pulumi.getter(name="snsTopicArn")
    def sns_topic_arn(self) -> str:
        """
        The ARN of the Amazon SNS topic.

        The following arguments are optional:
        """
        return pulumi.get(self, "sns_topic_arn")


@pulumi.output_type
class ResponsePlanIntegration(dict):
    def __init__(__self__, *,
                 pagerduties: Optional[Sequence['outputs.ResponsePlanIntegrationPagerduty']] = None):
        if pagerduties is not None:
            pulumi.set(__self__, "pagerduties", pagerduties)

    @property
    @pulumi.getter
    def pagerduties(self) -> Optional[Sequence['outputs.ResponsePlanIntegrationPagerduty']]:
        return pulumi.get(self, "pagerduties")


@pulumi.output_type
class ResponsePlanIntegrationPagerduty(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "secretId":
            suggest = "secret_id"
        elif key == "serviceId":
            suggest = "service_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ResponsePlanIntegrationPagerduty. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ResponsePlanIntegrationPagerduty.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ResponsePlanIntegrationPagerduty.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: str,
                 secret_id: str,
                 service_id: str):
        """
        :param str name: The name of the response plan.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "secret_id", secret_id)
        pulumi.set(__self__, "service_id", service_id)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the response plan.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="secretId")
    def secret_id(self) -> str:
        return pulumi.get(self, "secret_id")

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> str:
        return pulumi.get(self, "service_id")


@pulumi.output_type
class GetReplicationSetRegionResult(dict):
    def __init__(__self__, *,
                 kms_key_arn: str,
                 name: str,
                 status: str,
                 status_message: str):
        """
        :param str kms_key_arn: The ARN of the AWS Key Management Service (AWS KMS) encryption key.
        :param str name: The name of the Region.
        :param str status: The current status of the Region.
               * Valid Values: `ACTIVE` | `CREATING` | `UPDATING` | `DELETING` | `FAILED`
        :param str status_message: More information about the status of a Region.
        """
        pulumi.set(__self__, "kms_key_arn", kms_key_arn)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "status_message", status_message)

    @property
    @pulumi.getter(name="kmsKeyArn")
    def kms_key_arn(self) -> str:
        """
        The ARN of the AWS Key Management Service (AWS KMS) encryption key.
        """
        return pulumi.get(self, "kms_key_arn")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the Region.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The current status of the Region.
        * Valid Values: `ACTIVE` | `CREATING` | `UPDATING` | `DELETING` | `FAILED`
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="statusMessage")
    def status_message(self) -> str:
        """
        More information about the status of a Region.
        """
        return pulumi.get(self, "status_message")


@pulumi.output_type
class GetResponsePlanActionResult(dict):
    def __init__(__self__, *,
                 ssm_automations: Sequence['outputs.GetResponsePlanActionSsmAutomationResult']):
        """
        :param Sequence['GetResponsePlanActionSsmAutomationArgs'] ssm_automations: The Systems Manager automation document to start as the runbook at the beginning of the incident. The following values are supported:
        """
        pulumi.set(__self__, "ssm_automations", ssm_automations)

    @property
    @pulumi.getter(name="ssmAutomations")
    def ssm_automations(self) -> Sequence['outputs.GetResponsePlanActionSsmAutomationResult']:
        """
        The Systems Manager automation document to start as the runbook at the beginning of the incident. The following values are supported:
        """
        return pulumi.get(self, "ssm_automations")


@pulumi.output_type
class GetResponsePlanActionSsmAutomationResult(dict):
    def __init__(__self__, *,
                 document_name: str,
                 document_version: str,
                 dynamic_parameters: Mapping[str, str],
                 parameters: Sequence['outputs.GetResponsePlanActionSsmAutomationParameterResult'],
                 role_arn: str,
                 target_account: str):
        """
        :param str document_name: The automation document's name.
        :param str document_version: The version of the automation document to use at runtime.
        :param Mapping[str, str] dynamic_parameters: The key-value pair used to resolve dynamic parameter values when processing a Systems Manager Automation runbook.
        :param Sequence['GetResponsePlanActionSsmAutomationParameterArgs'] parameters: The key-value pair parameters used when the automation document runs. The following values are supported:
        :param str role_arn: The Amazon Resource Name (ARN) of the role that the automation document assumes when it runs commands.
        :param str target_account: The account that runs the automation document. This can be in either the management account or an application account.
        """
        pulumi.set(__self__, "document_name", document_name)
        pulumi.set(__self__, "document_version", document_version)
        pulumi.set(__self__, "dynamic_parameters", dynamic_parameters)
        pulumi.set(__self__, "parameters", parameters)
        pulumi.set(__self__, "role_arn", role_arn)
        pulumi.set(__self__, "target_account", target_account)

    @property
    @pulumi.getter(name="documentName")
    def document_name(self) -> str:
        """
        The automation document's name.
        """
        return pulumi.get(self, "document_name")

    @property
    @pulumi.getter(name="documentVersion")
    def document_version(self) -> str:
        """
        The version of the automation document to use at runtime.
        """
        return pulumi.get(self, "document_version")

    @property
    @pulumi.getter(name="dynamicParameters")
    def dynamic_parameters(self) -> Mapping[str, str]:
        """
        The key-value pair used to resolve dynamic parameter values when processing a Systems Manager Automation runbook.
        """
        return pulumi.get(self, "dynamic_parameters")

    @property
    @pulumi.getter
    def parameters(self) -> Sequence['outputs.GetResponsePlanActionSsmAutomationParameterResult']:
        """
        The key-value pair parameters used when the automation document runs. The following values are supported:
        """
        return pulumi.get(self, "parameters")

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> str:
        """
        The Amazon Resource Name (ARN) of the role that the automation document assumes when it runs commands.
        """
        return pulumi.get(self, "role_arn")

    @property
    @pulumi.getter(name="targetAccount")
    def target_account(self) -> str:
        """
        The account that runs the automation document. This can be in either the management account or an application account.
        """
        return pulumi.get(self, "target_account")


@pulumi.output_type
class GetResponsePlanActionSsmAutomationParameterResult(dict):
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        """
        :param str name: The name of the PagerDuty configuration.
        :param Sequence[str] values: The values for the associated parameter name.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the PagerDuty configuration.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        """
        The values for the associated parameter name.
        """
        return pulumi.get(self, "values")


@pulumi.output_type
class GetResponsePlanIncidentTemplateResult(dict):
    def __init__(__self__, *,
                 dedupe_string: str,
                 impact: int,
                 incident_tags: Mapping[str, str],
                 notification_targets: Sequence['outputs.GetResponsePlanIncidentTemplateNotificationTargetResult'],
                 summary: str,
                 title: str):
        """
        :param str dedupe_string: A string used to stop Incident Manager from creating multiple incident records for the same incident.
        :param int impact: The impact value of a generated incident. The following values are supported:
        :param Mapping[str, str] incident_tags: The tags assigned to an incident template. When an incident starts, Incident Manager assigns the tags specified in the template to the incident.
        :param Sequence['GetResponsePlanIncidentTemplateNotificationTargetArgs'] notification_targets: The Amazon Simple Notification Service (Amazon SNS) targets that this incident notifies when it is updated. The `notification_target` configuration block supports the following argument:
        :param str summary: The summary of an incident.
        :param str title: The title of a generated incident.
        """
        pulumi.set(__self__, "dedupe_string", dedupe_string)
        pulumi.set(__self__, "impact", impact)
        pulumi.set(__self__, "incident_tags", incident_tags)
        pulumi.set(__self__, "notification_targets", notification_targets)
        pulumi.set(__self__, "summary", summary)
        pulumi.set(__self__, "title", title)

    @property
    @pulumi.getter(name="dedupeString")
    def dedupe_string(self) -> str:
        """
        A string used to stop Incident Manager from creating multiple incident records for the same incident.
        """
        return pulumi.get(self, "dedupe_string")

    @property
    @pulumi.getter
    def impact(self) -> int:
        """
        The impact value of a generated incident. The following values are supported:
        """
        return pulumi.get(self, "impact")

    @property
    @pulumi.getter(name="incidentTags")
    def incident_tags(self) -> Mapping[str, str]:
        """
        The tags assigned to an incident template. When an incident starts, Incident Manager assigns the tags specified in the template to the incident.
        """
        return pulumi.get(self, "incident_tags")

    @property
    @pulumi.getter(name="notificationTargets")
    def notification_targets(self) -> Sequence['outputs.GetResponsePlanIncidentTemplateNotificationTargetResult']:
        """
        The Amazon Simple Notification Service (Amazon SNS) targets that this incident notifies when it is updated. The `notification_target` configuration block supports the following argument:
        """
        return pulumi.get(self, "notification_targets")

    @property
    @pulumi.getter
    def summary(self) -> str:
        """
        The summary of an incident.
        """
        return pulumi.get(self, "summary")

    @property
    @pulumi.getter
    def title(self) -> str:
        """
        The title of a generated incident.
        """
        return pulumi.get(self, "title")


@pulumi.output_type
class GetResponsePlanIncidentTemplateNotificationTargetResult(dict):
    def __init__(__self__, *,
                 sns_topic_arn: str):
        """
        :param str sns_topic_arn: The ARN of the Amazon SNS topic.
        """
        pulumi.set(__self__, "sns_topic_arn", sns_topic_arn)

    @property
    @pulumi.getter(name="snsTopicArn")
    def sns_topic_arn(self) -> str:
        """
        The ARN of the Amazon SNS topic.
        """
        return pulumi.get(self, "sns_topic_arn")


@pulumi.output_type
class GetResponsePlanIntegrationResult(dict):
    def __init__(__self__, *,
                 pagerduties: Sequence['outputs.GetResponsePlanIntegrationPagerdutyResult']):
        """
        :param Sequence['GetResponsePlanIntegrationPagerdutyArgs'] pagerduties: Details about the PagerDuty configuration for a response plan. The following values are supported:
        """
        pulumi.set(__self__, "pagerduties", pagerduties)

    @property
    @pulumi.getter
    def pagerduties(self) -> Sequence['outputs.GetResponsePlanIntegrationPagerdutyResult']:
        """
        Details about the PagerDuty configuration for a response plan. The following values are supported:
        """
        return pulumi.get(self, "pagerduties")


@pulumi.output_type
class GetResponsePlanIntegrationPagerdutyResult(dict):
    def __init__(__self__, *,
                 name: str,
                 secret_id: str,
                 service_id: str):
        """
        :param str name: The name of the PagerDuty configuration.
        :param str secret_id: The ID of the AWS Secrets Manager secret that stores your PagerDuty key &mdash; either a General Access REST API Key or User Token REST API Key &mdash; and other user credentials.
        :param str service_id: The ID of the PagerDuty service that the response plan associates with an incident when it launches.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "secret_id", secret_id)
        pulumi.set(__self__, "service_id", service_id)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the PagerDuty configuration.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="secretId")
    def secret_id(self) -> str:
        """
        The ID of the AWS Secrets Manager secret that stores your PagerDuty key &mdash; either a General Access REST API Key or User Token REST API Key &mdash; and other user credentials.
        """
        return pulumi.get(self, "secret_id")

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> str:
        """
        The ID of the PagerDuty service that the response plan associates with an incident when it launches.
        """
        return pulumi.get(self, "service_id")


