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

__all__ = [
    'AssessmentAssessmentReportsDestinationArgs',
    'AssessmentAssessmentReportsDestinationArgsDict',
    'AssessmentRoleArgs',
    'AssessmentRoleArgsDict',
    'AssessmentRolesAllArgs',
    'AssessmentRolesAllArgsDict',
    'AssessmentScopeArgs',
    'AssessmentScopeArgsDict',
    'AssessmentScopeAwsAccountArgs',
    'AssessmentScopeAwsAccountArgsDict',
    'AssessmentScopeAwsServiceArgs',
    'AssessmentScopeAwsServiceArgsDict',
    'ControlControlMappingSourceArgs',
    'ControlControlMappingSourceArgsDict',
    'ControlControlMappingSourceSourceKeywordArgs',
    'ControlControlMappingSourceSourceKeywordArgsDict',
    'FrameworkControlSetArgs',
    'FrameworkControlSetArgsDict',
    'FrameworkControlSetControlArgs',
    'FrameworkControlSetControlArgsDict',
    'GetControlControlMappingSourceArgs',
    'GetControlControlMappingSourceArgsDict',
    'GetControlControlMappingSourceSourceKeywordArgs',
    'GetControlControlMappingSourceSourceKeywordArgsDict',
    'GetFrameworkControlSetArgs',
    'GetFrameworkControlSetArgsDict',
    'GetFrameworkControlSetControlArgs',
    'GetFrameworkControlSetControlArgsDict',
]

MYPY = False

if not MYPY:
    class AssessmentAssessmentReportsDestinationArgsDict(TypedDict):
        destination: pulumi.Input[str]
        """
        Destination of the assessment report. This value be in the form `s3://{bucket_name}`.
        """
        destination_type: pulumi.Input[str]
        """
        Destination type. Currently, `S3` is the only valid value.
        """
elif False:
    AssessmentAssessmentReportsDestinationArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class AssessmentAssessmentReportsDestinationArgs:
    def __init__(__self__, *,
                 destination: pulumi.Input[str],
                 destination_type: pulumi.Input[str]):
        """
        :param pulumi.Input[str] destination: Destination of the assessment report. This value be in the form `s3://{bucket_name}`.
        :param pulumi.Input[str] destination_type: Destination type. Currently, `S3` is the only valid value.
        """
        pulumi.set(__self__, "destination", destination)
        pulumi.set(__self__, "destination_type", destination_type)

    @property
    @pulumi.getter
    def destination(self) -> pulumi.Input[str]:
        """
        Destination of the assessment report. This value be in the form `s3://{bucket_name}`.
        """
        return pulumi.get(self, "destination")

    @destination.setter
    def destination(self, value: pulumi.Input[str]):
        pulumi.set(self, "destination", value)

    @property
    @pulumi.getter(name="destinationType")
    def destination_type(self) -> pulumi.Input[str]:
        """
        Destination type. Currently, `S3` is the only valid value.
        """
        return pulumi.get(self, "destination_type")

    @destination_type.setter
    def destination_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "destination_type", value)


if not MYPY:
    class AssessmentRoleArgsDict(TypedDict):
        role_arn: pulumi.Input[str]
        """
        Amazon Resource Name (ARN) of the IAM role.
        """
        role_type: pulumi.Input[str]
        """
        Type of customer persona. For assessment creation, type must always be `PROCESS_OWNER`.
        """
elif False:
    AssessmentRoleArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class AssessmentRoleArgs:
    def __init__(__self__, *,
                 role_arn: pulumi.Input[str],
                 role_type: pulumi.Input[str]):
        """
        :param pulumi.Input[str] role_arn: Amazon Resource Name (ARN) of the IAM role.
        :param pulumi.Input[str] role_type: Type of customer persona. For assessment creation, type must always be `PROCESS_OWNER`.
        """
        pulumi.set(__self__, "role_arn", role_arn)
        pulumi.set(__self__, "role_type", role_type)

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> pulumi.Input[str]:
        """
        Amazon Resource Name (ARN) of the IAM role.
        """
        return pulumi.get(self, "role_arn")

    @role_arn.setter
    def role_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "role_arn", value)

    @property
    @pulumi.getter(name="roleType")
    def role_type(self) -> pulumi.Input[str]:
        """
        Type of customer persona. For assessment creation, type must always be `PROCESS_OWNER`.
        """
        return pulumi.get(self, "role_type")

    @role_type.setter
    def role_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "role_type", value)


if not MYPY:
    class AssessmentRolesAllArgsDict(TypedDict):
        role_arn: pulumi.Input[str]
        role_type: pulumi.Input[str]
elif False:
    AssessmentRolesAllArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class AssessmentRolesAllArgs:
    def __init__(__self__, *,
                 role_arn: pulumi.Input[str],
                 role_type: pulumi.Input[str]):
        pulumi.set(__self__, "role_arn", role_arn)
        pulumi.set(__self__, "role_type", role_type)

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> pulumi.Input[str]:
        return pulumi.get(self, "role_arn")

    @role_arn.setter
    def role_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "role_arn", value)

    @property
    @pulumi.getter(name="roleType")
    def role_type(self) -> pulumi.Input[str]:
        return pulumi.get(self, "role_type")

    @role_type.setter
    def role_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "role_type", value)


if not MYPY:
    class AssessmentScopeArgsDict(TypedDict):
        aws_accounts: NotRequired[pulumi.Input[Sequence[pulumi.Input['AssessmentScopeAwsAccountArgsDict']]]]
        """
        Amazon Web Services accounts that are in scope for the assessment. See `aws_accounts` below.
        """
        aws_services: NotRequired[pulumi.Input[Sequence[pulumi.Input['AssessmentScopeAwsServiceArgsDict']]]]
        """
        Amazon Web Services services that are included in the scope of the assessment. See `aws_services` below.
        """
elif False:
    AssessmentScopeArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class AssessmentScopeArgs:
    def __init__(__self__, *,
                 aws_accounts: Optional[pulumi.Input[Sequence[pulumi.Input['AssessmentScopeAwsAccountArgs']]]] = None,
                 aws_services: Optional[pulumi.Input[Sequence[pulumi.Input['AssessmentScopeAwsServiceArgs']]]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input['AssessmentScopeAwsAccountArgs']]] aws_accounts: Amazon Web Services accounts that are in scope for the assessment. See `aws_accounts` below.
        :param pulumi.Input[Sequence[pulumi.Input['AssessmentScopeAwsServiceArgs']]] aws_services: Amazon Web Services services that are included in the scope of the assessment. See `aws_services` below.
        """
        if aws_accounts is not None:
            pulumi.set(__self__, "aws_accounts", aws_accounts)
        if aws_services is not None:
            pulumi.set(__self__, "aws_services", aws_services)

    @property
    @pulumi.getter(name="awsAccounts")
    def aws_accounts(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AssessmentScopeAwsAccountArgs']]]]:
        """
        Amazon Web Services accounts that are in scope for the assessment. See `aws_accounts` below.
        """
        return pulumi.get(self, "aws_accounts")

    @aws_accounts.setter
    def aws_accounts(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AssessmentScopeAwsAccountArgs']]]]):
        pulumi.set(self, "aws_accounts", value)

    @property
    @pulumi.getter(name="awsServices")
    def aws_services(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AssessmentScopeAwsServiceArgs']]]]:
        """
        Amazon Web Services services that are included in the scope of the assessment. See `aws_services` below.
        """
        return pulumi.get(self, "aws_services")

    @aws_services.setter
    def aws_services(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AssessmentScopeAwsServiceArgs']]]]):
        pulumi.set(self, "aws_services", value)


if not MYPY:
    class AssessmentScopeAwsAccountArgsDict(TypedDict):
        id: pulumi.Input[str]
        """
        Identifier for the Amazon Web Services account.
        """
elif False:
    AssessmentScopeAwsAccountArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class AssessmentScopeAwsAccountArgs:
    def __init__(__self__, *,
                 id: pulumi.Input[str]):
        """
        :param pulumi.Input[str] id: Identifier for the Amazon Web Services account.
        """
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter
    def id(self) -> pulumi.Input[str]:
        """
        Identifier for the Amazon Web Services account.
        """
        return pulumi.get(self, "id")

    @id.setter
    def id(self, value: pulumi.Input[str]):
        pulumi.set(self, "id", value)


if not MYPY:
    class AssessmentScopeAwsServiceArgsDict(TypedDict):
        service_name: pulumi.Input[str]
        """
        Name of the Amazon Web Service.
        """
elif False:
    AssessmentScopeAwsServiceArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class AssessmentScopeAwsServiceArgs:
    def __init__(__self__, *,
                 service_name: pulumi.Input[str]):
        """
        :param pulumi.Input[str] service_name: Name of the Amazon Web Service.
        """
        pulumi.set(__self__, "service_name", service_name)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Input[str]:
        """
        Name of the Amazon Web Service.
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_name", value)


if not MYPY:
    class ControlControlMappingSourceArgsDict(TypedDict):
        source_name: pulumi.Input[str]
        """
        Name of the source.
        """
        source_set_up_option: pulumi.Input[str]
        """
        The setup option for the data source. This option reflects if the evidence collection is automated or manual. Valid values are `System_Controls_Mapping` (automated) and `Procedural_Controls_Mapping` (manual).
        """
        source_type: pulumi.Input[str]
        """
        Type of data source for evidence collection. If `source_set_up_option` is manual, the only valid value is `MANUAL`. If `source_set_up_option` is automated, valid values are `AWS_Cloudtrail`, `AWS_Config`, `AWS_Security_Hub`, or `AWS_API_Call`.

        The following arguments are optional:
        """
        source_description: NotRequired[pulumi.Input[str]]
        """
        Description of the source.
        """
        source_frequency: NotRequired[pulumi.Input[str]]
        """
        Frequency of evidence collection. Valid values are `DAILY`, `WEEKLY`, or `MONTHLY`.
        """
        source_id: NotRequired[pulumi.Input[str]]
        source_keyword: NotRequired[pulumi.Input['ControlControlMappingSourceSourceKeywordArgsDict']]
        """
        The keyword to search for in CloudTrail logs, Config rules, Security Hub checks, and Amazon Web Services API names. See `source_keyword` below.
        """
        troubleshooting_text: NotRequired[pulumi.Input[str]]
        """
        Instructions for troubleshooting the control.
        """
elif False:
    ControlControlMappingSourceArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class ControlControlMappingSourceArgs:
    def __init__(__self__, *,
                 source_name: pulumi.Input[str],
                 source_set_up_option: pulumi.Input[str],
                 source_type: pulumi.Input[str],
                 source_description: Optional[pulumi.Input[str]] = None,
                 source_frequency: Optional[pulumi.Input[str]] = None,
                 source_id: Optional[pulumi.Input[str]] = None,
                 source_keyword: Optional[pulumi.Input['ControlControlMappingSourceSourceKeywordArgs']] = None,
                 troubleshooting_text: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] source_name: Name of the source.
        :param pulumi.Input[str] source_set_up_option: The setup option for the data source. This option reflects if the evidence collection is automated or manual. Valid values are `System_Controls_Mapping` (automated) and `Procedural_Controls_Mapping` (manual).
        :param pulumi.Input[str] source_type: Type of data source for evidence collection. If `source_set_up_option` is manual, the only valid value is `MANUAL`. If `source_set_up_option` is automated, valid values are `AWS_Cloudtrail`, `AWS_Config`, `AWS_Security_Hub`, or `AWS_API_Call`.
               
               The following arguments are optional:
        :param pulumi.Input[str] source_description: Description of the source.
        :param pulumi.Input[str] source_frequency: Frequency of evidence collection. Valid values are `DAILY`, `WEEKLY`, or `MONTHLY`.
        :param pulumi.Input['ControlControlMappingSourceSourceKeywordArgs'] source_keyword: The keyword to search for in CloudTrail logs, Config rules, Security Hub checks, and Amazon Web Services API names. See `source_keyword` below.
        :param pulumi.Input[str] troubleshooting_text: Instructions for troubleshooting the control.
        """
        pulumi.set(__self__, "source_name", source_name)
        pulumi.set(__self__, "source_set_up_option", source_set_up_option)
        pulumi.set(__self__, "source_type", source_type)
        if source_description is not None:
            pulumi.set(__self__, "source_description", source_description)
        if source_frequency is not None:
            pulumi.set(__self__, "source_frequency", source_frequency)
        if source_id is not None:
            pulumi.set(__self__, "source_id", source_id)
        if source_keyword is not None:
            pulumi.set(__self__, "source_keyword", source_keyword)
        if troubleshooting_text is not None:
            pulumi.set(__self__, "troubleshooting_text", troubleshooting_text)

    @property
    @pulumi.getter(name="sourceName")
    def source_name(self) -> pulumi.Input[str]:
        """
        Name of the source.
        """
        return pulumi.get(self, "source_name")

    @source_name.setter
    def source_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_name", value)

    @property
    @pulumi.getter(name="sourceSetUpOption")
    def source_set_up_option(self) -> pulumi.Input[str]:
        """
        The setup option for the data source. This option reflects if the evidence collection is automated or manual. Valid values are `System_Controls_Mapping` (automated) and `Procedural_Controls_Mapping` (manual).
        """
        return pulumi.get(self, "source_set_up_option")

    @source_set_up_option.setter
    def source_set_up_option(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_set_up_option", value)

    @property
    @pulumi.getter(name="sourceType")
    def source_type(self) -> pulumi.Input[str]:
        """
        Type of data source for evidence collection. If `source_set_up_option` is manual, the only valid value is `MANUAL`. If `source_set_up_option` is automated, valid values are `AWS_Cloudtrail`, `AWS_Config`, `AWS_Security_Hub`, or `AWS_API_Call`.

        The following arguments are optional:
        """
        return pulumi.get(self, "source_type")

    @source_type.setter
    def source_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_type", value)

    @property
    @pulumi.getter(name="sourceDescription")
    def source_description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the source.
        """
        return pulumi.get(self, "source_description")

    @source_description.setter
    def source_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_description", value)

    @property
    @pulumi.getter(name="sourceFrequency")
    def source_frequency(self) -> Optional[pulumi.Input[str]]:
        """
        Frequency of evidence collection. Valid values are `DAILY`, `WEEKLY`, or `MONTHLY`.
        """
        return pulumi.get(self, "source_frequency")

    @source_frequency.setter
    def source_frequency(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_frequency", value)

    @property
    @pulumi.getter(name="sourceId")
    def source_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "source_id")

    @source_id.setter
    def source_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_id", value)

    @property
    @pulumi.getter(name="sourceKeyword")
    def source_keyword(self) -> Optional[pulumi.Input['ControlControlMappingSourceSourceKeywordArgs']]:
        """
        The keyword to search for in CloudTrail logs, Config rules, Security Hub checks, and Amazon Web Services API names. See `source_keyword` below.
        """
        return pulumi.get(self, "source_keyword")

    @source_keyword.setter
    def source_keyword(self, value: Optional[pulumi.Input['ControlControlMappingSourceSourceKeywordArgs']]):
        pulumi.set(self, "source_keyword", value)

    @property
    @pulumi.getter(name="troubleshootingText")
    def troubleshooting_text(self) -> Optional[pulumi.Input[str]]:
        """
        Instructions for troubleshooting the control.
        """
        return pulumi.get(self, "troubleshooting_text")

    @troubleshooting_text.setter
    def troubleshooting_text(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "troubleshooting_text", value)


if not MYPY:
    class ControlControlMappingSourceSourceKeywordArgsDict(TypedDict):
        keyword_input_type: pulumi.Input[str]
        """
        Input method for the keyword. Valid values are `SELECT_FROM_LIST`.
        """
        keyword_value: pulumi.Input[str]
        """
        The value of the keyword that's used when mapping a control data source. For example, this can be a CloudTrail event name, a rule name for Config, a Security Hub control, or the name of an Amazon Web Services API call. See the [Audit Manager supported control data sources documentation](https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources.html) for more information.
        """
elif False:
    ControlControlMappingSourceSourceKeywordArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class ControlControlMappingSourceSourceKeywordArgs:
    def __init__(__self__, *,
                 keyword_input_type: pulumi.Input[str],
                 keyword_value: pulumi.Input[str]):
        """
        :param pulumi.Input[str] keyword_input_type: Input method for the keyword. Valid values are `SELECT_FROM_LIST`.
        :param pulumi.Input[str] keyword_value: The value of the keyword that's used when mapping a control data source. For example, this can be a CloudTrail event name, a rule name for Config, a Security Hub control, or the name of an Amazon Web Services API call. See the [Audit Manager supported control data sources documentation](https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources.html) for more information.
        """
        pulumi.set(__self__, "keyword_input_type", keyword_input_type)
        pulumi.set(__self__, "keyword_value", keyword_value)

    @property
    @pulumi.getter(name="keywordInputType")
    def keyword_input_type(self) -> pulumi.Input[str]:
        """
        Input method for the keyword. Valid values are `SELECT_FROM_LIST`.
        """
        return pulumi.get(self, "keyword_input_type")

    @keyword_input_type.setter
    def keyword_input_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "keyword_input_type", value)

    @property
    @pulumi.getter(name="keywordValue")
    def keyword_value(self) -> pulumi.Input[str]:
        """
        The value of the keyword that's used when mapping a control data source. For example, this can be a CloudTrail event name, a rule name for Config, a Security Hub control, or the name of an Amazon Web Services API call. See the [Audit Manager supported control data sources documentation](https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources.html) for more information.
        """
        return pulumi.get(self, "keyword_value")

    @keyword_value.setter
    def keyword_value(self, value: pulumi.Input[str]):
        pulumi.set(self, "keyword_value", value)


if not MYPY:
    class FrameworkControlSetArgsDict(TypedDict):
        name: pulumi.Input[str]
        """
        Name of the control set.
        """
        controls: NotRequired[pulumi.Input[Sequence[pulumi.Input['FrameworkControlSetControlArgsDict']]]]
        """
        Configuration block(s) for the controls within the control set. See `controls` Block below for details.
        """
        id: NotRequired[pulumi.Input[str]]
        """
        Unique identifier for the framework.
        """
elif False:
    FrameworkControlSetArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class FrameworkControlSetArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 controls: Optional[pulumi.Input[Sequence[pulumi.Input['FrameworkControlSetControlArgs']]]] = None,
                 id: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] name: Name of the control set.
        :param pulumi.Input[Sequence[pulumi.Input['FrameworkControlSetControlArgs']]] controls: Configuration block(s) for the controls within the control set. See `controls` Block below for details.
        :param pulumi.Input[str] id: Unique identifier for the framework.
        """
        pulumi.set(__self__, "name", name)
        if controls is not None:
            pulumi.set(__self__, "controls", controls)
        if id is not None:
            pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        Name of the control set.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def controls(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FrameworkControlSetControlArgs']]]]:
        """
        Configuration block(s) for the controls within the control set. See `controls` Block below for details.
        """
        return pulumi.get(self, "controls")

    @controls.setter
    def controls(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FrameworkControlSetControlArgs']]]]):
        pulumi.set(self, "controls", value)

    @property
    @pulumi.getter
    def id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier for the framework.
        """
        return pulumi.get(self, "id")

    @id.setter
    def id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "id", value)


if not MYPY:
    class FrameworkControlSetControlArgsDict(TypedDict):
        id: pulumi.Input[str]
        """
        Unique identifier of the control.
        """
elif False:
    FrameworkControlSetControlArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class FrameworkControlSetControlArgs:
    def __init__(__self__, *,
                 id: pulumi.Input[str]):
        """
        :param pulumi.Input[str] id: Unique identifier of the control.
        """
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter
    def id(self) -> pulumi.Input[str]:
        """
        Unique identifier of the control.
        """
        return pulumi.get(self, "id")

    @id.setter
    def id(self, value: pulumi.Input[str]):
        pulumi.set(self, "id", value)


if not MYPY:
    class GetControlControlMappingSourceArgsDict(TypedDict):
        source_description: str
        source_frequency: str
        source_id: str
        source_name: str
        source_set_up_option: str
        source_type: str
        troubleshooting_text: str
        source_keyword: NotRequired['GetControlControlMappingSourceSourceKeywordArgsDict']
elif False:
    GetControlControlMappingSourceArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetControlControlMappingSourceArgs:
    def __init__(__self__, *,
                 source_description: str,
                 source_frequency: str,
                 source_id: str,
                 source_name: str,
                 source_set_up_option: str,
                 source_type: str,
                 troubleshooting_text: str,
                 source_keyword: Optional['GetControlControlMappingSourceSourceKeywordArgs'] = None):
        pulumi.set(__self__, "source_description", source_description)
        pulumi.set(__self__, "source_frequency", source_frequency)
        pulumi.set(__self__, "source_id", source_id)
        pulumi.set(__self__, "source_name", source_name)
        pulumi.set(__self__, "source_set_up_option", source_set_up_option)
        pulumi.set(__self__, "source_type", source_type)
        pulumi.set(__self__, "troubleshooting_text", troubleshooting_text)
        if source_keyword is not None:
            pulumi.set(__self__, "source_keyword", source_keyword)

    @property
    @pulumi.getter(name="sourceDescription")
    def source_description(self) -> str:
        return pulumi.get(self, "source_description")

    @source_description.setter
    def source_description(self, value: str):
        pulumi.set(self, "source_description", value)

    @property
    @pulumi.getter(name="sourceFrequency")
    def source_frequency(self) -> str:
        return pulumi.get(self, "source_frequency")

    @source_frequency.setter
    def source_frequency(self, value: str):
        pulumi.set(self, "source_frequency", value)

    @property
    @pulumi.getter(name="sourceId")
    def source_id(self) -> str:
        return pulumi.get(self, "source_id")

    @source_id.setter
    def source_id(self, value: str):
        pulumi.set(self, "source_id", value)

    @property
    @pulumi.getter(name="sourceName")
    def source_name(self) -> str:
        return pulumi.get(self, "source_name")

    @source_name.setter
    def source_name(self, value: str):
        pulumi.set(self, "source_name", value)

    @property
    @pulumi.getter(name="sourceSetUpOption")
    def source_set_up_option(self) -> str:
        return pulumi.get(self, "source_set_up_option")

    @source_set_up_option.setter
    def source_set_up_option(self, value: str):
        pulumi.set(self, "source_set_up_option", value)

    @property
    @pulumi.getter(name="sourceType")
    def source_type(self) -> str:
        return pulumi.get(self, "source_type")

    @source_type.setter
    def source_type(self, value: str):
        pulumi.set(self, "source_type", value)

    @property
    @pulumi.getter(name="troubleshootingText")
    def troubleshooting_text(self) -> str:
        return pulumi.get(self, "troubleshooting_text")

    @troubleshooting_text.setter
    def troubleshooting_text(self, value: str):
        pulumi.set(self, "troubleshooting_text", value)

    @property
    @pulumi.getter(name="sourceKeyword")
    def source_keyword(self) -> Optional['GetControlControlMappingSourceSourceKeywordArgs']:
        return pulumi.get(self, "source_keyword")

    @source_keyword.setter
    def source_keyword(self, value: Optional['GetControlControlMappingSourceSourceKeywordArgs']):
        pulumi.set(self, "source_keyword", value)


if not MYPY:
    class GetControlControlMappingSourceSourceKeywordArgsDict(TypedDict):
        keyword_input_type: str
        keyword_value: str
elif False:
    GetControlControlMappingSourceSourceKeywordArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetControlControlMappingSourceSourceKeywordArgs:
    def __init__(__self__, *,
                 keyword_input_type: str,
                 keyword_value: str):
        pulumi.set(__self__, "keyword_input_type", keyword_input_type)
        pulumi.set(__self__, "keyword_value", keyword_value)

    @property
    @pulumi.getter(name="keywordInputType")
    def keyword_input_type(self) -> str:
        return pulumi.get(self, "keyword_input_type")

    @keyword_input_type.setter
    def keyword_input_type(self, value: str):
        pulumi.set(self, "keyword_input_type", value)

    @property
    @pulumi.getter(name="keywordValue")
    def keyword_value(self) -> str:
        return pulumi.get(self, "keyword_value")

    @keyword_value.setter
    def keyword_value(self, value: str):
        pulumi.set(self, "keyword_value", value)


if not MYPY:
    class GetFrameworkControlSetArgsDict(TypedDict):
        id: str
        name: str
        """
        Name of the framework.
        """
        controls: NotRequired[Sequence['GetFrameworkControlSetControlArgsDict']]
elif False:
    GetFrameworkControlSetArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetFrameworkControlSetArgs:
    def __init__(__self__, *,
                 id: str,
                 name: str,
                 controls: Optional[Sequence['GetFrameworkControlSetControlArgs']] = None):
        """
        :param str name: Name of the framework.
        """
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "name", name)
        if controls is not None:
            pulumi.set(__self__, "controls", controls)

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @id.setter
    def id(self, value: str):
        pulumi.set(self, "id", value)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the framework.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: str):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def controls(self) -> Optional[Sequence['GetFrameworkControlSetControlArgs']]:
        return pulumi.get(self, "controls")

    @controls.setter
    def controls(self, value: Optional[Sequence['GetFrameworkControlSetControlArgs']]):
        pulumi.set(self, "controls", value)


if not MYPY:
    class GetFrameworkControlSetControlArgsDict(TypedDict):
        id: str
elif False:
    GetFrameworkControlSetControlArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetFrameworkControlSetControlArgs:
    def __init__(__self__, *,
                 id: str):
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @id.setter
    def id(self, value: str):
        pulumi.set(self, "id", value)


